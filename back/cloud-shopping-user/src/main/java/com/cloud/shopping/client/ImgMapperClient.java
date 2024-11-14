package com.cloud.shopping.client;

import com.cloud.shopping.provider.ImgMapperApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("game-service")
public interface ImgMapperClient extends ImgMapperApi {
}
