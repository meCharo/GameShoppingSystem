package com.cloud.shopping.mapper;

import com.cloud.shopping.entity.Img;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ImgMapper {
    int insert(Img record);

    int insertBatch(@Param(value = "game") Integer game, @Param(value = "imgs") List<String> imgs);

    List<String> selectByGame(Integer game);
}