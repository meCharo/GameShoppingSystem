package com.cloud.shopping.client;

import com.cloud.shopping.provider.OrderServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("order-service")
public interface OrderServiceClient extends OrderServiceApi {
}
