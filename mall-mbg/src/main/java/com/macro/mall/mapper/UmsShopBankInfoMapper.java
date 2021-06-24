package com.macro.mall.mapper;

import com.macro.mall.model.UmsShopBankInfo;
import com.macro.mall.model.UmsShopBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsShopBankInfoMapper {
    int countByExample(UmsShopBankInfoExample example);

    int deleteByExample(UmsShopBankInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsShopBankInfo record);

    int insertSelective(UmsShopBankInfo record);

    List<UmsShopBankInfo> selectByExample(UmsShopBankInfoExample example);

    UmsShopBankInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsShopBankInfo record, @Param("example") UmsShopBankInfoExample example);

    int updateByExample(@Param("record") UmsShopBankInfo record, @Param("example") UmsShopBankInfoExample example);

    int updateByPrimaryKeySelective(UmsShopBankInfo record);

    int updateByPrimaryKey(UmsShopBankInfo record);
}