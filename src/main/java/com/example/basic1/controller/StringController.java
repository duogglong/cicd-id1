package com.example.basic1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin("*")
public class StringController {

    @GetMapping("/ping")
    public String ping() {
        return "Application is started! v2 v2";
    }

    @GetMapping("/ping2")
    public String ping2() {
        return "Application is started! v22";
    }
}
