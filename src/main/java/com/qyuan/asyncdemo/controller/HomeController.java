package com.qyuan.asyncdemo.controller;

import com.qyuan.asyncdemo.service.SayHelloService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;

@RestController
public class HomeController {

    @Resource
    private SayHelloService sayHelloService;

    @RequestMapping("/")
    public String home() throws ExecutionException, InterruptedException {
        return sayHelloService.sayHello().get() + "  ********************  " +
                sayHelloService.sayHelloThread().get();
    }
}
