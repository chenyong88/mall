package com.macro.mall.portal.service;


import com.macro.mall.dto.OrderStatisticsDto;

/**
 * @author chenyong
 */
public interface OmsOrderService {
    /**
     * 根据订单类型获取订单列表
     * @param orderStatus
     * @param shopId
     * @param memberId
     * @return
     */
    Object getOrderInfoList(Integer orderStatus, Integer shopId, Integer memberId);

    OrderStatisticsDto getOrderStatus(String memberId, String shopId);
}
