package com.cloud.shopping.provider;

import com.cloud.shopping.entity.Img;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ImgMapperApi {

    @PostMapping("/feign/game/ImgMapper/insert")
    int insert(@RequestBody Img record);

    @PostMapping("/feign/game/ImgMapper/insertBatch")
    int insertBatch(@RequestParam("game") Integer game,
                    @RequestBody List<String> imgs);

    @PostMapping("/feign/game/ImgMapper/selectByGame")
    List<String> selectByGame(@RequestParam("game") Integer game);
}
