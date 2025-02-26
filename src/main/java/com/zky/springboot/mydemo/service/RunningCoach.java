package com.zky.springboot.mydemo.service;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "It's a long run";
    }

}
