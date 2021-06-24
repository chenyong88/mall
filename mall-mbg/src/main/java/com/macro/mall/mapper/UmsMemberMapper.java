package com.macro.mall.mapper;

import com.macro.mall.model.UmsMember;
import com.macro.mall.model.UmsMemberExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UmsMemberMapper {
    int countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    List<UmsMember> selectByExample(UmsMemberExample example);

    UmsMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("record") UmsMember record, @Param("example") UmsMemberExample example);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    @Select("SELECT *  FROM ums_member WHERE PHONE = #{telephone}  AND  STATUS = 1 ")
    UmsMember selectByPhone(@Param("telephone") String telephone);
}