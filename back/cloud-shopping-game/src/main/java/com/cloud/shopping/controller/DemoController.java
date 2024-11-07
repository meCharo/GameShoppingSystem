package com.cloud.shopping.controller;

import com.cloud.shopping.client.DemoClient;
import com.cloud.shopping.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoClient demoClient;

    @GetMapping("/feign/demo/{str}")
    public Result addOrder(@PathVariable("str") String str) {
        String res = demoClient.getStr(str);
        return Result.success(res);
    }
}
