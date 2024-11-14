package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Game;
import com.cloud.shopping.mapper.GameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feign/game/GameMapper")
public class GameMapperProvider {

    @Autowired
    private GameMapper gameMapper;

    @PostMapping("/selectById/")
    Game selectById(@RequestParam("id") Integer id){
        return gameMapper.selectById(id);
    }

    @GetMapping("/selectNums")
    int selectNums(){
        return gameMapper.selectNums();
    }

    @PostMapping("/selectByPage/")
    List<Game> selectByPage(@RequestParam("startPos") Integer startPos,
                            @RequestParam("size") Integer size){
        return gameMapper.selectByPage(startPos, size);
    }

    @PostMapping("/update/")
    int update(@RequestBody Game record){
        return gameMapper.update(record);
    }

    @GetMapping("/selectAll/")
    List<Game> selectAll(){
        return gameMapper.selectAll();
    }

    @PostMapping("/insert/")
    int insert(Game record){
        return gameMapper.insert(record);
    }

    @GetMapping("/demo")
    String demo(){
        return "hello feign";
    }
}
