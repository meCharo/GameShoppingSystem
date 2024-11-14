package com.cloud.shopping.provider;

import com.cloud.shopping.entity.User;
import com.cloud.shopping.utils.UserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class UserHolderProvider {

    @Autowired
    private UserHolder userHolder;

    @GetMapping("/feign/user/getUser")
    public User getUser(){
        return userHolder.getUser();
    }

    @GetMapping("/feign/user/demo")
    public String demo(){
        return "hello feign";
    }
}
