package com.zky.springboot.mydemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

    @GetMapping("/")
    public String salute() {
        return "Hello World";
    }
    
}
