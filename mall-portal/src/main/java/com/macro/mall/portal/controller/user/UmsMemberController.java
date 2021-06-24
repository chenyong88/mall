package com.macro.mall.portal.controller.user;

import com.macro.mall.portal.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 会员登录注册管理Controller
 * Created by macro on 2018/8/3.
 */
@Controller
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取验证码")
    @GetMapping("/getAuthCode")
    @ResponseBody
    public Object getAuthCode( @RequestParam String telephone) {
        return   memberService.generateAuthCode(telephone);
    }

    @ApiOperation("登录注册并且获取当前店铺状态")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "telephone",value = "手机号码",required = true,paramType="form"),
            @ApiImplicitParam(name = "type",value = "登录类型(0-一键登录  1-验证码登录)",required = true,paramType="form"),
            @ApiImplicitParam(name = "authCode",value = "验证码(一键登录时验证码可为空)",paramType="form")
    })
    public Object login( String telephone, String type,
                         String authCode) {
        return  memberService.login(telephone,type,authCode);
    }
}
