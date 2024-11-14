package com.cloud.shopping.controller;

import com.cloud.shopping.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
@RequestMapping(value = "/demo")
public class DemoController extends AbstractController{

    @GetMapping(value = "userclient")
    public Result userclient() {
        System.out.println("==========================");
//        System.out.println(gameMapper.selectById(1));
//        System.out.println(userHolder.getUser().getId());
        System.out.println("==========================");
//        return String.valueOf(userHolder.getUser().getId());
        return Result.success();
    }

}

