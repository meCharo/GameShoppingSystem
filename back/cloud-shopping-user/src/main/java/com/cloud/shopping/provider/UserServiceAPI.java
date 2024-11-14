package com.cloud.shopping.provider;

import org.springframework.web.bind.annotation.GetMapping;

public interface UserServiceAPI {
    @GetMapping("/feign/user/delNotValidateUser")
    public void delNotValidateUser();

    @GetMapping("/feign/user/expireToken")
    public void expireToken();
}
