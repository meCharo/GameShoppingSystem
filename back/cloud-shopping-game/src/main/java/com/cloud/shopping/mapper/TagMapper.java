package com.cloud.shopping.mapper;

import com.cloud.shopping.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface TagMapper {

    int insert(Tag record);

    Tag selectById(Integer id);

    List<Tag> selectByIds(@Param(value = "ids") List<Integer> ids);

    List<Integer> selectIdByLikeName(String info);

    List<Tag> selectAll();

    int update(Tag record);

}
