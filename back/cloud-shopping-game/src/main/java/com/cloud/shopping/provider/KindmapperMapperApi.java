package com.cloud.shopping.provider;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface KindmapperMapperApi {

    @PostMapping("/feign/game/KindmapperMapper/insertKindBatch")
    int insertKindBatch(@RequestParam("game") Integer game,
                        @RequestBody List<Integer> kinds);

    @PostMapping("/feign/game/KindmapperMapper/selectByGame")
    List<Integer> selectByGame(@RequestParam("game") Integer game);

    @PostMapping("/feign/game/KindmapperMapper/deleteByGame")
    int deleteByGame(@RequestParam("game") Integer game);

    @PostMapping("/feign/game/KindmapperMapper/deleteByKind")
    int deleteByKind(@RequestParam("kind") Integer kind);

    @PostMapping("/feign/game/KindmapperMapper/insertGameBatch")
    int insertGameBatch(@RequestParam("kind") Integer kind,
                        @RequestBody List<Integer> games);

}
