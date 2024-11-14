package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Kind;
import com.cloud.shopping.mapper.KindMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feign/kindmapper")
public class KindMapperProvider {
    @Autowired
    private KindMapper kindMapper;

    @PostMapping("/selectByIds")
    List<Kind> selectByIds(@RequestBody List<Integer> ids){
        return kindMapper.selectByIds(ids);
    }

    @PostMapping("/selectByName")
    Kind selectByName(@RequestParam("name") String name) {
        return kindMapper.selectByName(name);
    }

    @PostMapping("/insert")
    int insert(@RequestBody Kind record){
        return kindMapper.insert(record);
    }
}
