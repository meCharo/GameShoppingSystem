package com.cloud.shopping.client;

import com.cloud.shopping.provider.KindmapperMapperApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("game-service")
public interface KindmapperMapperClient extends KindmapperMapperApi {
}
