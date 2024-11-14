package com.cloud.shopping.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

//将外部配置（通常是application.properties或application.yml文件中的属性）绑定到一个Java对象的字段上
@ConfigurationProperties(prefix = "ly.filter")
public class FilterProperties {

    private List<String> allowPaths;

    public List<String> getAllowPaths() {
        return allowPaths;
    }

    public void setAllowPaths(List<String> allowPaths) {
        this.allowPaths = allowPaths;
    }
}