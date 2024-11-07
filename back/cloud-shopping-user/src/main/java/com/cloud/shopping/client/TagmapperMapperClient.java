package com.cloud.shopping.client;

import com.cloud.shopping.provider.TagmapperMapperApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("game-service")
public interface TagmapperMapperClient extends TagmapperMapperApi {
}
