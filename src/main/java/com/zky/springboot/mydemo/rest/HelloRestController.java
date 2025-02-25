package com.zky.springboot.mydemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

    @Value("${pos3.hero}")
    private String pos3Hero;

    @GetMapping("/")
    public String salute() {
        return pos3Hero;
    }
}
