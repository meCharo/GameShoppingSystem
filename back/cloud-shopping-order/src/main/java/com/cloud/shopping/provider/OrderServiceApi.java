package com.cloud.shopping.provider;

import org.springframework.web.bind.annotation.GetMapping;

public interface OrderServiceApi {

    @GetMapping("/feign/order/cancelOrder")
    public void autoCancelOrder();

    @GetMapping("/feign/order/demo")
    public String demo();
}
