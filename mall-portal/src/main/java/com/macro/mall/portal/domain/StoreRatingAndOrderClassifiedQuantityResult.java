package com.macro.mall.portal.domain;

import com.macro.mall.portal.vo.OrderStatisticsVo;
import com.macro.mall.portal.vo.StoreRatingVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "工作台商铺评分和订单分类数据" ,description = "工作台商铺评分和订单分类数据")
public class StoreRatingAndOrderClassifiedQuantityResult implements Serializable {


    @ApiModelProperty(value = "商品评价Vo")
   private StoreRatingVo storeRatingVo;

    @ApiModelProperty(value = "订单数据状态统计Vo")
    private OrderStatisticsVo OrderStatistics;


}
