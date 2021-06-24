package com.macro.mall.portal.service.application;

import com.macro.mall.model.UmsShopBankInfo;
import com.macro.mall.portal.domain.CommonResult;

/**
 * @author chenyong
 */
public interface CapitalCenterApplication {
    /**
     * 获取资金中心资金和绑定银行卡数据
     * @param shopId
     * @param memberId
     * @return
     */
    CommonResult getCapitalCenterInfo(Integer shopId, Integer memberId);

    /**
     * addBankInfo 添加绑定账户
     * @param umsShopBankInfo
     * @return
     */
    CommonResult addBankInfo(UmsShopBankInfo umsShopBankInfo);

    /**
     * 获取账户李恩
     * @param shopId
     * @param memberId
     * @return
     */
    CommonResult getBankInfoList(Long shopId, Long memberId);

    /**
     * 删除账户
     * @param shopId
     * @param memberId
     * @param bankId
     * @return
     */
    CommonResult deleteBankInfo(Long shopId, Long memberId, Long bankId);
}
