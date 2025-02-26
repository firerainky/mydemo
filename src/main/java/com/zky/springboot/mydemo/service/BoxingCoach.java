package com.zky.springboot.mydemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoxingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice jumping rope at first";
    }
}
