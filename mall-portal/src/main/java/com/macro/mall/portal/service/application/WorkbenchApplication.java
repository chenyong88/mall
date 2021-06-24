package com.macro.mall.portal.service.application;

import com.macro.mall.portal.domain.CommonResult;

/**
 * 工作台组合数据
 * @author chenyong
 */
public interface WorkbenchApplication {

    /**
     * 工作台-获取商铺评分&订单分类汇总数据
     * @param memberId
     * @param shopId
     * @return
     */
    CommonResult getStoreRatingAndOrderClassifiedQuantity(String memberId, String shopId);

    /**
     * 获取今日交易数据
     * @param memberId
     * @param shopId
     * @return
     */
    CommonResult getTodayTradingData(String memberId, String shopId);

    /**
     * 获取资金中心数据
     * @param memberId
     * @param shopId
     * @return
     */
    CommonResult getCapitalCenterData(String memberId, String shopId);
}
