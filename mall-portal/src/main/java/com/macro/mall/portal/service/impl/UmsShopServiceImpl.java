package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.dao.UmsShopBaseinfoMapper;
import com.macro.mall.portal.dao.UmsShopCertificatesInfoMapper;
import com.macro.mall.portal.domain.CommonResult;
import com.macro.mall.portal.domain.ShopParam;
import com.macro.mall.portal.model.UmsShopCertificatesInfo;
import com.macro.mall.portal.service.UmsShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UmsShopServiceImpl implements UmsShopService {

    @Autowired
    private UmsShopBaseinfoMapper shopBaseinfoMapper;

    @Autowired
    private UmsShopCertificatesInfoMapper shopCertificatesInfoMapper;

    @Override
    @Transactional
    public CommonResult addShopInfo(ShopParam shopParam) {
        int shopId =  shopBaseinfoMapper.insertSelective(shopParam.getShopBaseinfo());
        UmsShopCertificatesInfo shopCertificatesInfo =  shopParam.getShopCertificatesInfo();
        shopCertificatesInfo.setShopId(shopId);
        shopCertificatesInfoMapper.insertSelective(shopCertificatesInfo);
        return  new CommonResult().success("提交店铺申请成功");
    }
}
