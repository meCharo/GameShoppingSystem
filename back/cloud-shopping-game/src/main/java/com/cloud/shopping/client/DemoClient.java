package com.cloud.shopping.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("kind-service")
public interface DemoClient {

    @GetMapping("demo/{str}")
    public String getStr(@PathVariable("str") String str);
}
