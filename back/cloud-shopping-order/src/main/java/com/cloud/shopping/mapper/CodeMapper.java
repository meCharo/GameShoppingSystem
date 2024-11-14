package com.cloud.shopping.mapper;

import com.cloud.shopping.entity.Code;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodeMapper {

    int insert(Code record);

    Code selectById(Integer id);

    int update(Code record);

}
