package com.itmuch.mapper;

import com.itmuch.pojo.Orderdinnerfood;
import com.itmuch.pojo.OrderdinnerfoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdinnerfoodMapper {
    long countByExample(OrderdinnerfoodExample example);

    int deleteByExample(OrderdinnerfoodExample example);

    int deleteByPrimaryKey(String foodid);

    int insert(Orderdinnerfood record);

    int insertSelective(Orderdinnerfood record);

    List<Orderdinnerfood> selectByExample(OrderdinnerfoodExample example);

    Orderdinnerfood selectByPrimaryKey(String foodid);

    int updateByExampleSelective(@Param("record") Orderdinnerfood record, @Param("example") OrderdinnerfoodExample example);

    int updateByExample(@Param("record") Orderdinnerfood record, @Param("example") OrderdinnerfoodExample example);

    int updateByPrimaryKeySelective(Orderdinnerfood record);

    int updateByPrimaryKey(Orderdinnerfood record);
}