package com.macro.mall.portal.service.impl;

import com.macro.mall.mapper.UmsShopBankInfoMapper;
import com.macro.mall.model.UmsShopBankInfo;
import com.macro.mall.model.UmsShopBankInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenyong
 */
@Service
public class UmsShopBankInfoServiceImpl implements UmsShopBankInfoService {

    @Autowired
    private UmsShopBankInfoMapper shopBankInfoMapper;

    @Override
    public int addBankInfo(UmsShopBankInfo umsShopBankInfo) {
        return  shopBankInfoMapper.insertSelective(umsShopBankInfo);
    }

    @Override
    public UmsShopBankInfo getBankInfoById(long id) {
        return shopBankInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UmsShopBankInfo> getBankInfoByMemberId(Long shopId, Long memberId) {
        UmsShopBankInfoExample example =  new UmsShopBankInfoExample();
        example.createCriteria().andShopIdEqualTo(shopId).andMemberIdEqualTo(memberId);
        return shopBankInfoMapper.selectByExample(example);

    }

    @Override
    public int deleteBankInfo(Long shopId, Long memberId, Long bankId) {
        //设置删除状态
        UmsShopBankInfoExample example =  this.getUmsShopBankInfoExample(shopId,memberId,bankId);
        UmsShopBankInfo bankInfo =  new UmsShopBankInfo();
        bankInfo.setStatus(1);
        return shopBankInfoMapper.updateByExampleSelective(bankInfo,example);
    }

    private  UmsShopBankInfoExample getUmsShopBankInfoExample(Long shopId, Long memberId,Long bankId){
        UmsShopBankInfoExample example =  new UmsShopBankInfoExample();
        UmsShopBankInfoExample.Criteria  criteriab  =  example.createCriteria();
        if(null != shopId){
            criteriab.andShopIdEqualTo(shopId);
        }
        if(null != memberId){
            criteriab.andMemberIdEqualTo(memberId);
        }
        if(null != bankId){
            criteriab.andIdEqualTo(bankId);
        }
        return  example;
    }
}
