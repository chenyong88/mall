package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.dao.CmsWelcomePageMapper;
import com.macro.mall.portal.model.CmsWelcomePage;
import com.macro.mall.portal.service.WelcomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * @author chenyong
 * 获取欢迎页
 */
@Service
public class WelcomePageServiceImpl  implements WelcomePageService {

    @Autowired
    private CmsWelcomePageMapper cmsWelcomePageMapper;


    @Override
    public CmsWelcomePage getWelcomePageByType(Integer type) {

        List<CmsWelcomePage> list = cmsWelcomePageMapper.selectByExample(null);
        list = list.stream().filter(item->  type.equals(item.getType())).collect(Collectors.toList());
        if(list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
