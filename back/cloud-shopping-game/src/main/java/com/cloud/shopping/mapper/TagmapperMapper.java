package com.cloud.shopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.cloud.shopping.entity.Tagmapper;

@Mapper
public interface TagmapperMapper {
    int insert(Tagmapper record);

    List<Integer> selectByTag(Integer tag);

    List<Integer> selectByGame(Integer game);

    List<Integer> selectBatchByTags(@Param(value = "tags") List<Integer> tags);
}