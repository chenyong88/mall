package com.macro.mall.portal.service.impl;

import cn.hutool.json.JSONUtil;
import com.macro.mall.mapper.UmsMemberLevelMapper;
import com.macro.mall.mapper.UmsMemberMapper;
import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberExample;
import com.macro.mall.model.UmsMemberLevel;
import com.macro.mall.model.UmsMemberLevelExample;
import com.macro.mall.portal.dao.UmsShopBaseinfoMapper;
import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.domain.MemberDetails;
import com.macro.mall.portal.model.UmsShopBaseinfo;
import com.macro.mall.portal.service.RedisService;
import com.macro.mall.portal.service.UmsMemberService;
import com.macro.mall.portal.util.ali.AliSmsUtil;
import com.macro.mall.portal.vo.UmsUserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * 商家会员管理Service实现类
 * Created by macro on 2018/8/3.
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private UmsMemberMapper memberMapper;
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Autowired
    private UmsShopBaseinfoMapper shopBaseinfoMapper;

    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode.login}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${authCode.expire.seconds}")
    private Long AUTH_CODE_EXPIRE_SECONDS;
    @Value("${sms.template.code.login}")
    private  String  TEMPLATE_CODE;
    @Value("${sms.sign.name}")
    private   String SIGN_NAME;



    @Override
    public UmsMember getByUsername(String username) {
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsMember> memberList =  null;// memberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(memberList)) {
            return memberList.get(0);
        }
        return null;
    }

    @Override
    public UmsMember getById(Long id) {
        return  null;// memberMapper.selectByPrimaryKey(id);
    }

    @Override
    public CommonResult register(String username, String password, String telephone, String authCode) {
        //验证验证码
        if(!verifyAuthCode(authCode,telephone)){
            return new CommonResult().failed("验证码错误");
        }
        //查询是否已有该用户
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(username);
        example.or(example.createCriteria().andPhoneEqualTo(telephone));
        List<UmsMember> umsMembers = null ;//memberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            return new CommonResult().failed("该用户已经存在");
        }
        this.registerMember(username,telephone,password);
        return new CommonResult().success("注册成功",null);
    }

    @Override
    public CommonResult generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<6;i++){
            sb.append(random.nextInt(10));
        }
        Map<String,Object> map  =  new HashMap<>();
        map.put("code",sb.toString());
        if(AliSmsUtil.sendSms(telephone, JSONUtil.toJsonStr(map),TEMPLATE_CODE,SIGN_NAME)){
            //验证码绑定手机号并存储到redis
            redisService.set(REDIS_KEY_PREFIX_AUTH_CODE+telephone,sb.toString());
            redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE+telephone,AUTH_CODE_EXPIRE_SECONDS);
            return new CommonResult().success(1);
        }
        return new CommonResult().success(0);
    }

    @Override
    public CommonResult updatePassword(String telephone, String password, String authCode) {
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPhoneEqualTo(telephone);
        List<UmsMember> memberList = null; memberMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(memberList)){
            return new CommonResult().failed("该账号不存在");
        }
        //验证验证码
        if(!verifyAuthCode(authCode,telephone)){
            return new CommonResult().failed("验证码错误");
        }
        UmsMember umsMember = memberList.get(0);
       // umsMember.setPassword(passwordEncoder.encodePassword(password,null));
        memberMapper.updateByPrimaryKeySelective(umsMember);
        return new CommonResult().success("密码修改成功",null);
    }

    @Override
    public UmsMember getCurrentMember() {
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        MemberDetails memberDetails = (MemberDetails) auth.getPrincipal();
        return memberDetails.getUmsMember();
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {
        UmsMember record=new UmsMember();
        record.setId(id);
        record.setIntegration(integration);
       // memberMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public CommonResult oneclickLogin(String telephone) {
        //查看手机号码是否注册过 未注册直接注册
        UmsMember umsMembers =  memberMapper.selectByPhone(telephone);
        if(null == umsMembers){
           umsMembers =   this.registerMember("",telephone,"");
        }
        //注册用户进行店铺权限查询
        return  new CommonResult().success("登录成功",umsMembers);
    }

    @Override
    public CommonResult login(String telephone, String type, String authCode) {

        //验证验登录时需要验证验证码
        if("1".equals(type) &&  !this.verifyAuthCode(authCode,telephone)){
            return  new CommonResult().failed("验证码验证失败");
        }

        UmsUserInfoVo umsUserInfoVo =  new UmsUserInfoVo();
        //查看手机号码是否注册过 未注册直接注册
        int  memberId = 0;
        UmsMember umsMember  =  memberMapper.selectByPhone(telephone);
        if(null == umsMember){
          umsMember =   this.registerMember("",telephone,"");
        }

        //注册用户进行店铺权限查询
        UmsShopBaseinfo shopBaseinfo = shopBaseinfoMapper.selectByUserId(memberId);

        umsUserInfoVo.setShopBaseinfo(shopBaseinfo);
        umsUserInfoVo.setUmsMember(umsMember);
        return  new CommonResult().success("登录成功",umsUserInfoVo);
    }

    //对输入的验证码进行校验
    private boolean verifyAuthCode(String authCode, String telephone){
        if(StringUtils.isEmpty(authCode)){
            return false;
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        return authCode.equals(realAuthCode);
    }


    /**
     * 注册用户
     * @param username
     * @param telephone
     * @param password
     * @return
     */
    private UmsMember  registerMember(String username,String telephone,String password){
        long memberId = 0;
        UmsMember umsMember = new UmsMember();
        try {
            //没有该用户进行添加操作
            umsMember.setUsername(username);
            umsMember.setPhone(telephone);
           // umsMember.setPassword(passwordEncoder.encodePassword(password, null));
            umsMember.setCreateTime(new Date());
            umsMember.setStatus(1);
            //获取默认会员等级并设置
            UmsMemberLevelExample levelExample = new UmsMemberLevelExample();
            levelExample.createCriteria().andDefaultStatusEqualTo(1);
            List<UmsMemberLevel> memberLevelList = memberLevelMapper.selectByExample(levelExample);
            if (!CollectionUtils.isEmpty(memberLevelList)) {
                umsMember.setMemberLevelId(memberLevelList.get(0).getId());
            }
            memberId =  memberMapper.insert(umsMember);
            umsMember.setId(memberId);
            umsMember.setPassword(null);
            return  umsMember;
        }catch (Exception e){

        }
         return   umsMember;
    }

}
