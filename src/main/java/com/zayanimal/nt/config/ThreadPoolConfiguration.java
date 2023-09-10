package com.zayanimal.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ThreadPoolConfiguration {

    @Bean
    public ExecutorService exec() {
        return Executors.newFixedThreadPool(2);
    }
}
