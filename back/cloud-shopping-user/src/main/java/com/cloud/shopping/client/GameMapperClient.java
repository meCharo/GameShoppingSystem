package com.cloud.shopping.client;

import com.cloud.shopping.provider.GameMapperApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("game-service")
public interface GameMapperClient extends GameMapperApi {
}
