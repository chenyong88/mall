package com.macro.mall.portal.service;

import com.macro.mall.portal.model.CmsWelcomePage;

/**
 * @author chenyong
 */
public interface WelcomePageService {


    /**
     * 获取欢迎页数据
     * @param type
     * @return
     */
    CmsWelcomePage getWelcomePageByType(Integer type);
}
