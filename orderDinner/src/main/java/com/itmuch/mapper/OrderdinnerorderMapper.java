package com.itmuch.mapper;

import com.itmuch.pojo.Orderdinnerorder;
import com.itmuch.pojo.OrderdinnerorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdinnerorderMapper {
    long countByExample(OrderdinnerorderExample example);

    int deleteByExample(OrderdinnerorderExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(Orderdinnerorder record);

    int insertSelective(Orderdinnerorder record);

    List<Orderdinnerorder> selectByExample(OrderdinnerorderExample example);

    Orderdinnerorder selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") Orderdinnerorder record, @Param("example") OrderdinnerorderExample example);

    int updateByExample(@Param("record") Orderdinnerorder record, @Param("example") OrderdinnerorderExample example);

    int updateByPrimaryKeySelective(Orderdinnerorder record);

    int updateByPrimaryKey(Orderdinnerorder record);
}