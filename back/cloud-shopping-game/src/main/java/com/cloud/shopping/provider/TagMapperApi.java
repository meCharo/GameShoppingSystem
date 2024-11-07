package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TagMapperApi {

    @PostMapping("/feign/game/TagMapper/selectByIds")
    List<Tag> selectByIds(@RequestBody List<Integer> ids);
}
