package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Tag;
import com.cloud.shopping.mapper.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class TagMapperProvider {
    @Autowired
    private TagMapper tagMapper;

    @PostMapping("/feign/game/tagmapper/selectByIds")
    List<Tag> selectByIds(@RequestBody List<Integer> ids){
        return tagMapper.selectByIds(ids);
    }
}
