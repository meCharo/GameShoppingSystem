package com.cloud.shopping.client;


import com.cloud.shopping.provider.KindMapperApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("game-service")
public interface KindMapperClient extends KindMapperApi {
}
