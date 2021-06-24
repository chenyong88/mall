package com.macro.mall.portal.service.application.impl;

import com.macro.mall.dto.OrderStatisticsDto;
import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.domain.StoreRatingAndOrderClassifiedQuantityResult;
import com.macro.mall.portal.service.OmsOrderService;
import com.macro.mall.portal.service.application.WorkbenchApplication;
import com.macro.mall.portal.vo.CapitalCenterVo;
import com.macro.mall.portal.vo.OrderStatisticsVo;
import com.macro.mall.portal.vo.StoreRatingVo;
import com.macro.mall.portal.vo.TodayTradingData;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author chenyong
 */
@Service
public class WorkbenchApplicationImpl  implements WorkbenchApplication {

    @Autowired
    private OmsOrderService omsOrderService;

    @Override
    public CommonResult getStoreRatingAndOrderClassifiedQuantity(String memberId, String shopId) {

        StoreRatingAndOrderClassifiedQuantityResult storeRatingAndOrderClassifiedQuantityResult
                  =  new StoreRatingAndOrderClassifiedQuantityResult();
        //根据店铺ID查询不同状态的订单数据
        OrderStatisticsDto orderStatisticsDto =  omsOrderService.getOrderStatus(memberId,shopId);
        OrderStatisticsVo  orderStatisticsVo  = new OrderStatisticsVo();
        if(null != orderStatisticsDto)
            BeanUtils.copyProperties(orderStatisticsDto,orderStatisticsVo);

        storeRatingAndOrderClassifiedQuantityResult.setOrderStatistics(orderStatisticsVo);

        //根据店铺ID查询不同类型的评分
        //TODO
        StoreRatingVo storeRatingVo = new StoreRatingVo();
        storeRatingAndOrderClassifiedQuantityResult.setStoreRatingVo(storeRatingVo);

        return new CommonResult().success(storeRatingAndOrderClassifiedQuantityResult);
    }

    @Override
    public CommonResult getTodayTradingData(String memberId, String shopId) {
        TodayTradingData todayTradingData =  new TodayTradingData();
        //TODO 数据组装获取
        //1.获取今日交易总额

        //2.获取交易订单数

        //3.获取商品访客

        return  new CommonResult().success(todayTradingData);
    }

    @Override
    public CommonResult getCapitalCenterData(String memberId, String shopId) {
        CapitalCenterVo capitalCenterVo =  new CapitalCenterVo();
        //获取账户余额
        //获取账户资产
        //绑定账户
        return new CommonResult().success(capitalCenterVo);
    }
}
