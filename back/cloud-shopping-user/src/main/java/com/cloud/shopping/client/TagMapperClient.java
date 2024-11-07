package com.cloud.shopping.client;

import com.cloud.shopping.provider.TagMapperApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("game-service")
public interface TagMapperClient extends TagMapperApi {
}
