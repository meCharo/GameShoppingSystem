package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Tag;
import com.cloud.shopping.mapper.TagmapperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class TagmapperMapperProvider {
    @Autowired
    private TagmapperMapper tagmapperMapper;

    @PostMapping("/feign/game/tagmapperMapper/selectByGame")
    List<Integer> selectByGame(@RequestParam("game") Integer game){
        return tagmapperMapper.selectByGame(game);
    }
}
