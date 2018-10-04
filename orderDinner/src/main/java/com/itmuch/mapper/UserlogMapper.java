package com.itmuch.mapper;

import com.itmuch.pojo.Userlog;
import com.itmuch.pojo.UserlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserlogMapper {
    long countByExample(UserlogExample example);

    int deleteByExample(UserlogExample example);

    int deleteByPrimaryKey(String recordid);

    int insert(Userlog record);

    int insertSelective(Userlog record);

    List<Userlog> selectByExampleWithBLOBs(UserlogExample example);

    List<Userlog> selectByExample(UserlogExample example);

    Userlog selectByPrimaryKey(String recordid);

    int updateByExampleSelective(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByExample(@Param("record") Userlog record, @Param("example") UserlogExample example);

    int updateByPrimaryKeySelective(Userlog record);

    int updateByPrimaryKeyWithBLOBs(Userlog record);

    int updateByPrimaryKey(Userlog record);
}