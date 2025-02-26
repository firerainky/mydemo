package com.zky.springboot.mydemo.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WritingCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Write 100 words";
    }
}
