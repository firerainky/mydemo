package com.zky.springboot.mydemo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    @Bean
    public Coach anotherBoxingCoach() {
        return new BoxingCoach();
    }
}
