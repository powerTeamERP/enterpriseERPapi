package com.itmuch.mapper;

import com.itmuch.pojo.Orderdinnerconfig;
import com.itmuch.pojo.OrderdinnerconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdinnerconfigMapper {
    long countByExample(OrderdinnerconfigExample example);

    int deleteByExample(OrderdinnerconfigExample example);

    int deleteByPrimaryKey(String configid);

    int insert(Orderdinnerconfig record);

    int insertSelective(Orderdinnerconfig record);

    List<Orderdinnerconfig> selectByExample(OrderdinnerconfigExample example);

    Orderdinnerconfig selectByPrimaryKey(String configid);

    int updateByExampleSelective(@Param("record") Orderdinnerconfig record, @Param("example") OrderdinnerconfigExample example);

    int updateByExample(@Param("record") Orderdinnerconfig record, @Param("example") OrderdinnerconfigExample example);

    int updateByPrimaryKeySelective(Orderdinnerconfig record);

    int updateByPrimaryKey(Orderdinnerconfig record);
}