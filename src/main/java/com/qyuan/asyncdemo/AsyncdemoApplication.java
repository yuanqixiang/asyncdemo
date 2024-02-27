package com.qyuan.asyncdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
@EnableAsync
public class AsyncdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AsyncdemoApplication.class, args);
	}

	@Bean("executor")
	public ExecutorService getThreadPool() {
		return Executors.newSingleThreadExecutor();
	}
}
