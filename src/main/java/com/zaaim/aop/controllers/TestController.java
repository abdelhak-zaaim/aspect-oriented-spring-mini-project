package com.zaaim.aop.controllers;

import com.zaaim.aop.services.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final SampleService sampleService;

    public TestController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/test")
    public String test() {
        return sampleService.performTask();
    }
}
