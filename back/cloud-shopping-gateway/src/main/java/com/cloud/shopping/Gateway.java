package com.cloud.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 **/
@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient // 注册到eureka
@EnableZuulProxy //启动Zuul网关的功能, 通过 extend zuulfilter扩展功能
public class Gateway extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Gateway.class);
    }
}
