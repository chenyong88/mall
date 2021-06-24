package com.macro.mall.portal.controller.capital;


import com.macro.mall.model.UmsShopBankInfo;
import com.macro.mall.portal.service.application.CapitalCenterApplication;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyong
 */
@Api(tags = "OmsOrderController", description = "资金中心")
@RestController
@RequestMapping("/capital")
public class CapitalCenterController {

    @Autowired
    private CapitalCenterApplication capitalCenterApplication;

    @ApiOperation("获取资金中心数据")
    @GetMapping("/getCapitalCenterInfo")
    public  Object getCapitalCenterInfo( @RequestParam Integer shopId,
                                    @RequestParam Integer memberId) {
        return  capitalCenterApplication.getCapitalCenterInfo(shopId,memberId);
    }


    @ApiOperation("绑定账户银行卡信息")
    @PostMapping("/addBankInfo")
    public  Object addBankInfo(@RequestBody  UmsShopBankInfo umsShopBankInfo) {
        return  capitalCenterApplication.addBankInfo(umsShopBankInfo);
    }

    @ApiOperation("查询账户银行卡信息")
    @GetMapping("/getBankInfoList")
    public  Object getBankInfoList(@RequestParam Long shopId,
                               @RequestParam Long memberId) {
        return  capitalCenterApplication.getBankInfoList(shopId,memberId);
    }

    @ApiOperation("绑定账户银行卡信息")
    @GetMapping("/deleteBankInfo")
    public  Object deleteBankInfo(@RequestParam Long shopId,
                                  @RequestParam Long memberId,
                                  @RequestParam Long bankId) {
        return  capitalCenterApplication.deleteBankInfo(shopId,memberId,bankId);
    }

}
