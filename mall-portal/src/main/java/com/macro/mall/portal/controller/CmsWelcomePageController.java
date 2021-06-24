package com.macro.mall.portal.controller;

import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.model.CmsWelcomePage;
import com.macro.mall.portal.service.WelcomePageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "CmsWelcomePageController", description = "商家端&客户端欢迎页")
@RestController
@RequestMapping("/welcome")
public class CmsWelcomePageController {

    @Autowired
    private WelcomePageService welcomePageService;

    @ApiOperation("获取欢迎页")
    @RequestMapping(value = "/getWelcomePage", method = RequestMethod.POST)
    public  Object getWelcomePage(@RequestParam Integer type) {
        CmsWelcomePage cmsWelcomePage =  welcomePageService.getWelcomePageByType(type);
        if (null != cmsWelcomePage) {
            return new CommonResult().success(cmsWelcomePage);
        }
        return new CommonResult().failed();
    }

}
