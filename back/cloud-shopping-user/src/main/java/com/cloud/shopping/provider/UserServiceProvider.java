package com.cloud.shopping.provider;

import com.cloud.shopping.entity.User;
import com.cloud.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceProvider {
    @Autowired
    private UserService userService;

    @GetMapping("/feign/user/delNotValidateUser")
    public void delNotValidateUser(){
        userService.delNotValidateUser();
    }

    @GetMapping("/feign/user/expireToken")
    public void expireToken(){
        userService.expireToken();
    }


}
