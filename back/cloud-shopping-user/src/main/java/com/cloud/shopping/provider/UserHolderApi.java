package com.cloud.shopping.provider;

import com.cloud.shopping.entity.User;
import com.cloud.shopping.utils.UserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserHolderApi {

    @GetMapping("/feign/user/getUser")
    public User getUser();

    @GetMapping("/feign/user/demo")
    public String demo();
}
