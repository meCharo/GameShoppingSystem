package com.cloud.shopping.provider;

import com.cloud.shopping.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceProvider {
    @Autowired
    private OrderService orderService;

    @GetMapping("/feign/order/cancelOrder")
    public void cancelOrder(){
        orderService.autoCancelOrder();
    }

    @GetMapping("/feign/order/demo")
    public String demo(){
        return "hello feign";
    }
}
