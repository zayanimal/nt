package com.zayanimal.nt.controller;

import com.zayanimal.nt.service.LoadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final LoadService loadService;

    @GetMapping("/load")
    public String load() {
        return loadService.load();
    }


}
