package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TagmapperMapperApi {

    @PostMapping("/feign/game/TagmapperMapper/selectByGame")
    List<Integer> selectByGame(@RequestParam("game") Integer game);

}
