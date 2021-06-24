package com.macro.mall.portal.service.impl;

import com.macro.mall.model.UmsShopBankInfo;

import java.util.List;

/**
 * @author chenyong
 */
public interface UmsShopBankInfoService {
    /**
     * 添加银行卡信息并且返回数据
     * @param umsShopBankInfo
     * @return
     */
    int addBankInfo(UmsShopBankInfo umsShopBankInfo);

    UmsShopBankInfo getBankInfoById(long id);

    List<UmsShopBankInfo> getBankInfoByMemberId(Long shopId, Long memberId);

    int deleteBankInfo(Long shopId, Long memberId, Long bankId);
}
