package com.cloud.shopping.client;

import com.cloud.shopping.provider.UserServiceAPI;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("user-service")
public interface UserServiceClient extends UserServiceAPI{
}
