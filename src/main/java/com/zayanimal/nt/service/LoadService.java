package com.zayanimal.nt.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@RequiredArgsConstructor
public class LoadService {

    public String load() {
        CompletableFuture.runAsync(() -> {
            try {
                log.info("Current thread: {}", Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).thenRun(() -> {
            log.info("Task executed: {}", Thread.currentThread().getName());
        });

        return "OK";
    }
}
