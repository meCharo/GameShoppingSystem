package com.cloud.shopping.provider;

import com.cloud.shopping.mapper.KindmapperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feign/game/Kindmappermapper")
public class KindmapperMapperProvider {

    @Autowired
    private KindmapperMapper kindmapperMapper;

    @PostMapping("/insertKindBatch")
    int insertKindBatch(@RequestParam("game") Integer game,
                        @RequestBody List<Integer> kinds){
        return kindmapperMapper.insertKindBatch(game, kinds);
    }

    @PostMapping("/selectByGame")
    List<Integer> selectByGame(@RequestParam("game") Integer game){
        return kindmapperMapper.selectByGame(game);
    }

    @PostMapping("/deleteByGame")
    int deleteByGame(@RequestParam("game") Integer game){
        return kindmapperMapper.deleteByGame(game);
    }

    @PostMapping("/deleteByKind")
    int deleteByKind(@RequestParam("kind") Integer kind){
        return kindmapperMapper.deleteByKind(kind);
    }

    @PostMapping("/insertGameBatch")
    int insertGameBatch(@RequestParam("kind") Integer kind,
                        @RequestBody List<Integer> games){
        return kindmapperMapper.insertGameBatch(kind, games);
    }
}
