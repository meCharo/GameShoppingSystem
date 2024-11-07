package com.cloud.shopping.service;


import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    public String helloWorld(){
        return "HelloWorld";
    }
}
