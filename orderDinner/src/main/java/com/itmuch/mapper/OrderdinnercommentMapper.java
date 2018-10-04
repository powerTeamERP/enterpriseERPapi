package com.itmuch.mapper;

import com.itmuch.pojo.Orderdinnercomment;
import com.itmuch.pojo.OrderdinnercommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderdinnercommentMapper {
    long countByExample(OrderdinnercommentExample example);

    int deleteByExample(OrderdinnercommentExample example);

    int deleteByPrimaryKey(String commentid);

    int insert(Orderdinnercomment record);

    int insertSelective(Orderdinnercomment record);

    List<Orderdinnercomment> selectByExampleWithBLOBs(OrderdinnercommentExample example);

    List<Orderdinnercomment> selectByExample(OrderdinnercommentExample example);

    Orderdinnercomment selectByPrimaryKey(String commentid);

    int updateByExampleSelective(@Param("record") Orderdinnercomment record, @Param("example") OrderdinnercommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Orderdinnercomment record, @Param("example") OrderdinnercommentExample example);

    int updateByExample(@Param("record") Orderdinnercomment record, @Param("example") OrderdinnercommentExample example);

    int updateByPrimaryKeySelective(Orderdinnercomment record);

    int updateByPrimaryKeyWithBLOBs(Orderdinnercomment record);

    int updateByPrimaryKey(Orderdinnercomment record);
}