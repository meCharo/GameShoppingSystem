package com.cloud.shopping.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("kind-service")
public interface KindmapperMapperClient {
}
