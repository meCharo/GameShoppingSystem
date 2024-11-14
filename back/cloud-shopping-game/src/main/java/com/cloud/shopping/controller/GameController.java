package com.cloud.shopping.controller;

import com.cloud.shopping.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.cloud.shopping.utils.Result;
import com.cloud.shopping.utils.NotFoundException;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping(value = "game")
public class GameController extends AbstractController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "{id}")
    public ModelAndView gameInfo(@PathVariable(value = "id") Integer id) {
        if (!gameService.exists(id)) {
            throw new NotFoundException();
        }
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id", id);
        return new ModelAndView("redirect:http://localhost:9000/gameInfo.jsp", data);
    }

    @PostMapping(value = "{id}")
    @ResponseBody
    public Result selectById(@PathVariable(value = "id") Integer id) {
        return gameService.getById(id);
    }



}

