package com.itmuch.mapper;

import com.itmuch.pojo.Rolemenu;
import com.itmuch.pojo.RolemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolemenuMapper {
    long countByExample(RolemenuExample example);

    int deleteByExample(RolemenuExample example);

    int deleteByPrimaryKey(String rolemenuid);

    int insert(Rolemenu record);

    int insertSelective(Rolemenu record);

    List<Rolemenu> selectByExample(RolemenuExample example);

    Rolemenu selectByPrimaryKey(String rolemenuid);

    int updateByExampleSelective(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByExample(@Param("record") Rolemenu record, @Param("example") RolemenuExample example);

    int updateByPrimaryKeySelective(Rolemenu record);

    int updateByPrimaryKey(Rolemenu record);
}