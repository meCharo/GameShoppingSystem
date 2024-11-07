package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Kind;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface KindMapperApi {

    @PostMapping("/feign/game/KindMapper/selectByIds")
    List<Kind> selectByIds(@RequestBody List<Integer> ids);

    @PostMapping("/feign/game/KindMapper/selectByName")
    Kind selectByName(@RequestParam("name") String name);

    @PostMapping("/feign/game/KindMapper/insert")
    int insert(@RequestBody Kind record);
}
