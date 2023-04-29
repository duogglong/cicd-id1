package com.example.basic1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/attendee")
public class AttendeeController {

    @GetMapping("/get-all")
    public String getAll() {
        return "Runnnn";
    }
}
