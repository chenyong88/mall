package com.macro.mall.portal.dao;

import com.macro.mall.portal.model.UmsShopCertificatesInfo;
import com.macro.mall.portal.model.UmsShopCertificatesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsShopCertificatesInfoMapper {
    int countByExample(UmsShopCertificatesInfoExample example);

    int deleteByExample(UmsShopCertificatesInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsShopCertificatesInfo record);

    int insertSelective(UmsShopCertificatesInfo record);

    List<UmsShopCertificatesInfo> selectByExample(UmsShopCertificatesInfoExample example);

    UmsShopCertificatesInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsShopCertificatesInfo record, @Param("example") UmsShopCertificatesInfoExample example);

    int updateByExample(@Param("record") UmsShopCertificatesInfo record, @Param("example") UmsShopCertificatesInfoExample example);

    int updateByPrimaryKeySelective(UmsShopCertificatesInfo record);

    int updateByPrimaryKey(UmsShopCertificatesInfo record);
}