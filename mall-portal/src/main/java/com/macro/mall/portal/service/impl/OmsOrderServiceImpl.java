package com.macro.mall.portal.service.impl;

import com.macro.mall.dto.OrderStatisticsDto;
import com.macro.mall.mapper.OmsOrderMapper;
import com.macro.mall.portal.service.OmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenyong
 */
@Service
public class OmsOrderServiceImpl  implements OmsOrderService {

    @Autowired
    private OmsOrderMapper orderMapper;

    @Override
    public Object getOrderInfoList(Integer orderStatus, Integer shopId, Integer memberId) {
        return null;
    }

    @Override
    public OrderStatisticsDto getOrderStatus(String memberId, String shopId) {

        return orderMapper.selectByMemberIdAndShopIdSumByStatus(memberId,shopId);
    }
}
