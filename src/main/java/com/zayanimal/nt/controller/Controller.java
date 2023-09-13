package com.zayanimal.nt.controller;

import com.zayanimal.nt.service.LoadService;
import com.zayanimal.nt.service.QueueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final LoadService loadService;

    private final QueueService queueService;

    @GetMapping("/load")
    public String load() {
        return loadService.load();
    }

    @GetMapping("/queue")
    public String queue(@RequestParam("timeout") long timeout) {
        return queueService.queue(timeout);
    }
}
