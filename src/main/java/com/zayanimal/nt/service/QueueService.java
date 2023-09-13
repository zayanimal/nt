package com.zayanimal.nt.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Slf4j
@Service
@RequiredArgsConstructor
public class QueueService {

    private final ExecutorService executorService;

    public String queue(long timeout) {
        executorService.execute(() -> {
            try {
                val threadName = Thread.currentThread().getName();
                log.info("Task started: {}", threadName);
                Thread.sleep(timeout);
                log.info("Task completed: {}", threadName);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        return "OK";
    }
}
