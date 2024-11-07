package com.cloud.shopping;

import com.cloud.shopping.client.UserServiceClient;
import com.cloud.shopping.client.OrderServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private UserServiceClient userService;
    @Autowired
    private OrderServiceClient orderService;

    @Scheduled(fixedRate = 1000 * 60 * 3)
    public void delNotValidateUser() {
        userService.delNotValidateUser();
    }

    @Scheduled(fixedRate = 1000 * 60 * 10)
    public void expireToken() {
        userService.expireToken();
    }

    @Scheduled(fixedRate = 1000 * 60)
    public void cancelOrder() {
        orderService.autoCancelOrder();
    }

}
