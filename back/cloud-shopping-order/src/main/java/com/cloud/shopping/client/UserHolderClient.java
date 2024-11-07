package com.cloud.shopping.client;

import com.cloud.shopping.interceptor.FeignRequestInterceptor;
import com.cloud.shopping.provider.UserHolderApi;
import com.cloud.shopping.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient("user-service")
@FeignClient(value = "user-service", configuration = FeignRequestInterceptor.class)
public interface UserHolderClient extends UserHolderApi{
}


