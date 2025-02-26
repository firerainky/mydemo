package com.zky.springboot.mydemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zky.springboot.mydemo.service.Coach;


@RestController
public class HelloRestController {

    private Coach coach;
    
    public HelloRestController(Coach coach) {
        this.coach = coach;
    }

    @Value("${pos3.hero}")
    private String pos3Hero;

    @GetMapping("/")
    public String salute() {
        return pos3Hero;
    }

    @GetMapping("/dailyworkout")
    public String getDailyworkout() {
        return coach.getDailyWorkout();
    }
}
