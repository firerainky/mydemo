package com.zky.springboot.mydemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zky.springboot.mydemo.service.Coach;

@RestController
@RequestMapping("/configBean")
public class ConfigBeanController {

    private Coach coach;

    public ConfigBeanController(@Qualifier("anotherBoxingCoach") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
