package com.cloud.shopping.controller;

import com.cloud.shopping.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.cloud.shopping.utils.Result;
import com.cloud.shopping.utils.NotFoundException;

@Controller
//@RequestMapping(value = "game")
public class ShowController extends AbstractController {

    @Autowired
    private GameService gameService;

    //
    /**
     * 获取每日推荐，随机选取5个游戏，每日生成一次
     *
     * @return
     */
    @PostMapping(value = "everyday")
    @ResponseBody
    public Result everyday() {
        return gameService.getRandomGames();
    }


    @GetMapping(value = "shoppingcart")
    public String shoppingcart() {
        return "redirect:http://localhost:9000/shoppingcart.jsp";
    }

    /**
     * 最新的5个游戏，根据上架时间排序，放在缓存中
     *
     * @return
     */
    @PostMapping(value = "newestgames")
    @ResponseBody
    public Result newestGames() {
        return gameService.newestGames();
    }

    /**
     * 最新的5个未上架游戏，根据时间排序，放在缓存中
     *
     * @return
     */
    @PostMapping(value = "preupgames")
    @ResponseBody
    public Result preUpGames() {
        return gameService.preUpGames();
    }

    @PostMapping(value = "freegames")
    @ResponseBody
    public Result getFreeGames() {
        return gameService.getFreeGames();
    }

    @GetMapping(value = "search")
    public String search() {
        return "redirect:http://localhost:9000/search.jsp";
    }

    @PostMapping(value = "search")
    @ResponseBody
    public Result search(String info) {
        return gameService.search(info);
    }
}
