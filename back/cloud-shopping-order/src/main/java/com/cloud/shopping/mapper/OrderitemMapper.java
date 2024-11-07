package com.cloud.shopping.mapper;

import com.cloud.shopping.entity.Orderitem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderitemMapper {

    int insert(Orderitem record);

    List<Orderitem> selectByIds(@Param(value = "ids") List<Integer> ids);

    int update(Orderitem record);

}
