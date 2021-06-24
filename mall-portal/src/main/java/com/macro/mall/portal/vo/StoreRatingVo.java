package com.macro.mall.portal.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author chenyong
 */
@Data
@ApiModel(value = "工作台商铺评价" ,description = "工作台商铺评价Vo")
public class StoreRatingVo {

    @ApiModelProperty(value = "服务评价")
    private  String  serviceEvaluation;

    @ApiModelProperty(value = "商品评价")
    private  String  productEvaluation;

    @ApiModelProperty(value = "速度评价")
    private  String  speedEvaluation;
}
