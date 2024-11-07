package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Game;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface GameMapperApi {

    @PostMapping("/feign/game/GameMapper/selectById/")
    Game selectById(@RequestParam("id") Integer id);

    @GetMapping("/feign/game/GameMapper/selectNums")
    int selectNums();

    @PostMapping("/feign/game/GameMapper/selectByPage/")
    List<Game> selectByPage(@RequestParam("startPos") Integer startPos,
                            @RequestParam("size") Integer size);

    @PostMapping("/feign/game/GameMapper/update/")
    int update(@RequestBody Game record);

    @GetMapping("/feign/game/GameMapper/selectAll/")
    List<Game> selectAll();

    @PostMapping("/feign/game/GameMapper/insert/")
    int insert(Game record);

    @GetMapping("/feign/game/GameMapper/demo")
    String demo();
}
