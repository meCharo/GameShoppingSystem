package com.cloud.shopping.mapper;


import com.cloud.shopping.entity.Kindmapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface KindmapperMapper {

    int insert(Kindmapper record);

    int insertKindBatch(@Param(value = "game") Integer game, @Param(value = "kinds") List<Integer> kinds);

    int insertGameBatch(@Param(value = "kind") Integer kind, @Param(value = "games") List<Integer> games);

    List<Integer> selectByKind(Integer kind);

    List<Integer> selectByGame(Integer game);

    List<Integer> selectBatchByKinds(@Param(value = "kinds") List<Integer> kinds);

    int deleteByGame(Integer game);

    int deleteByKind(Integer kind);

}