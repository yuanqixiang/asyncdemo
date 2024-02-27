package com.qyuan.asyncdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class SayHelloService {
    @Async
    public CompletableFuture<String> sayHello() {
        log.info("我是异步执行的，默认线程池：" + Thread.currentThread().getName());
        return CompletableFuture.completedFuture("Hello, 您好, 现在时间是: " + LocalDateTime.now());
    }

    @Async("executor")
    public CompletableFuture<String> sayHelloThread() {
        log.info("我是异步执行的，定制线程池：" + Thread.currentThread().getName());
        return CompletableFuture.completedFuture("Hello, 您好, 现在时间是: " + LocalDateTime.now());
    }
}
