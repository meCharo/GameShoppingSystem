package com.cloud.shopping.mapper;

import com.cloud.shopping.entity.Ordermapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdermapperMapper {
    int insert(Ordermapper record);

    List<Integer> selectByOrder(Integer order);
}
