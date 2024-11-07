package com.cloud.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//public class UserApplication
//{
//    public static void main( String[] args)
//    {
//        SpringApplication.run(UserApplication.class,args);
//    }
//}

public class SchedulerApplication extends SpringBootServletInitializer
{
    public static void main( String[] args)
    {
        SpringApplication.run(SchedulerApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SchedulerApplication.class);
    }

}