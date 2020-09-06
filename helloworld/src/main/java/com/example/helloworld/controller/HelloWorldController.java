package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloWorldController {
    @Value("${app.format}")
    private String message;

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return String.format(message, name);
    }
}
