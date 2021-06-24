package com.macro.mall.portal.service.application.impl;

import com.macro.mall.model.UmsShopBankInfo;
import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.service.application.CapitalCenterApplication;
import com.macro.mall.portal.service.impl.UmsShopBankInfoService;
import com.macro.mall.portal.vo.CapitalCenterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenyong
 */
@Service
public class CapitalCenterApplicationImpl  implements CapitalCenterApplication {

    @Autowired
    private UmsShopBankInfoService shopBankInfoService;

    @Override
    public CommonResult getCapitalCenterInfo(Integer shopId, Integer memberId) {
        CapitalCenterVo capitalCenterVo = new CapitalCenterVo();
        //实现资金数据和账户绑定
        return new  CommonResult().success(capitalCenterVo);
    }

    @Override
    public CommonResult addBankInfo(UmsShopBankInfo umsShopBankInfo) {
        int id =   shopBankInfoService.addBankInfo(umsShopBankInfo);
        UmsShopBankInfo umsShopBankInfoVo = shopBankInfoService.getBankInfoById(id);
        return  new CommonResult().success(umsShopBankInfoVo);
    }

    @Override
    public CommonResult getBankInfoList(Long shopId, Long memberId) {
        List<UmsShopBankInfo> list = shopBankInfoService.getBankInfoByMemberId(shopId,memberId);
        return   new CommonResult().success(list);
    }

    @Override
    public CommonResult deleteBankInfo(Long shopId, Long memberId, Long bankId) {
        return      new CommonResult().success(shopBankInfoService.deleteBankInfo(shopId,memberId,bankId));
    }
}
