package com.cloud.shopping.mapper;


import com.cloud.shopping.entity.Kind;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface KindMapper {

    int insert(Kind record);

    Kind selectById(Integer id);

    List<Kind> selectAll();

    List<Kind> selectByIds(@Param(value = "ids") List<Integer> ids);

    Kind selectByName(String name);

    List<Integer> selectIdByLikeName(String name);

    int delete(Integer id);

    int update(Kind record);

}