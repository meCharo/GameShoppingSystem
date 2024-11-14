package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Img;
import com.cloud.shopping.mapper.ImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ImgMapperProvider {
    @Autowired
    private ImgMapper imgMapper;

    @PostMapping("/feign/game/imgMapper/insert")
    int insert(@RequestBody Img record){
        return imgMapper.insert(record);
    }

    @PostMapping("/feign/game/imgMapper/insertBatch")
    int insertBatch(@RequestParam("game") Integer game,
                    @RequestBody List<String> imgs){
        return imgMapper.insertBatch(game, imgs);
    }

    @PostMapping("/feign/game/imgMapper/selectByGame")
    List<String> selectByGame(@RequestParam("game") Integer game){
        return imgMapper.selectByGame(game);
    }
}
