package com.macro.mall.portal.dao;

import com.macro.mall.portal.model.UmsShopBaseinfo;
import com.macro.mall.portal.model.UmsShopBaseinfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UmsShopBaseinfoMapper {
    int countByExample(UmsShopBaseinfoExample example);

    int deleteByExample(UmsShopBaseinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsShopBaseinfo record);

    int insertSelective(UmsShopBaseinfo record);

    List<UmsShopBaseinfo> selectByExample(UmsShopBaseinfoExample example);

    UmsShopBaseinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsShopBaseinfo record, @Param("example") UmsShopBaseinfoExample example);

    int updateByExample(@Param("record") UmsShopBaseinfo record, @Param("example") UmsShopBaseinfoExample example);

    int updateByPrimaryKeySelective(UmsShopBaseinfo record);

    int updateByPrimaryKey(UmsShopBaseinfo record);

    @Select("SELECT *  FROM  ums_shop_baseinfo WHERE member_id = #{memberId}")
    UmsShopBaseinfo selectByUserId(@Param("memberId") int memberId);
}