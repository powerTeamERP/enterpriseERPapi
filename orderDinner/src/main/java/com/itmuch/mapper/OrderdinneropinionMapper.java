package com.itmuch.mapper;

import com.itmuch.pojo.Orderdinneropinion;
import com.itmuch.pojo.OrderdinneropinionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdinneropinionMapper {
    long countByExample(OrderdinneropinionExample example);

    int deleteByExample(OrderdinneropinionExample example);

    int deleteByPrimaryKey(String opinionid);

    int insert(Orderdinneropinion record);

    int insertSelective(Orderdinneropinion record);

    List<Orderdinneropinion> selectByExampleWithBLOBs(OrderdinneropinionExample example);

    List<Orderdinneropinion> selectByExample(OrderdinneropinionExample example);

    Orderdinneropinion selectByPrimaryKey(String opinionid);

    int updateByExampleSelective(@Param("record") Orderdinneropinion record, @Param("example") OrderdinneropinionExample example);

    int updateByExampleWithBLOBs(@Param("record") Orderdinneropinion record, @Param("example") OrderdinneropinionExample example);

    int updateByExample(@Param("record") Orderdinneropinion record, @Param("example") OrderdinneropinionExample example);

    int updateByPrimaryKeySelective(Orderdinneropinion record);

    int updateByPrimaryKeyWithBLOBs(Orderdinneropinion record);

    int updateByPrimaryKey(Orderdinneropinion record);
}