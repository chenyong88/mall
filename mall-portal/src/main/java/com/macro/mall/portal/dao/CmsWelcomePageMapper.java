package com.macro.mall.portal.dao;

import com.macro.mall.portal.model.CmsWelcomePage;
import com.macro.mall.portal.model.CmsWelcomePageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsWelcomePageMapper {
    int countByExample(CmsWelcomePageExample example);

    int deleteByExample(CmsWelcomePageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsWelcomePage record);

    int insertSelective(CmsWelcomePage record);

    List<CmsWelcomePage> selectByExample(CmsWelcomePageExample example);

    CmsWelcomePage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsWelcomePage record, @Param("example") CmsWelcomePageExample example);

    int updateByExample(@Param("record") CmsWelcomePage record, @Param("example") CmsWelcomePageExample example);

    int updateByPrimaryKeySelective(CmsWelcomePage record);

    int updateByPrimaryKey(CmsWelcomePage record);
}