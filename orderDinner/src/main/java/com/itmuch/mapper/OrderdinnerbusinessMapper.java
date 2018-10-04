package com.itmuch.mapper;

import com.itmuch.pojo.Orderdinnerbusiness;
import com.itmuch.pojo.OrderdinnerbusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdinnerbusinessMapper {
    long countByExample(OrderdinnerbusinessExample example);

    int deleteByExample(OrderdinnerbusinessExample example);

    int deleteByPrimaryKey(String businessid);

    int insert(Orderdinnerbusiness record);

    int insertSelective(Orderdinnerbusiness record);

    List<Orderdinnerbusiness> selectByExample(OrderdinnerbusinessExample example);

    Orderdinnerbusiness selectByPrimaryKey(String businessid);

    int updateByExampleSelective(@Param("record") Orderdinnerbusiness record, @Param("example") OrderdinnerbusinessExample example);

    int updateByExample(@Param("record") Orderdinnerbusiness record, @Param("example") OrderdinnerbusinessExample example);

    int updateByPrimaryKeySelective(Orderdinnerbusiness record);

    int updateByPrimaryKey(Orderdinnerbusiness record);
}