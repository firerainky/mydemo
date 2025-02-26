package com.zky.springboot.mydemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zky.springboot.mydemo.service.Coach;

@RestController
@RequestMapping("/prototype")
public class CheckPrototypeScopeController {

    private Coach firstCoach;
    private Coach secondCoach;

    public CheckPrototypeScopeController(@Qualifier("writingCoach") Coach firstCoach,
            @Qualifier("writingCoach") Coach secondCoach) {
        this.firstCoach = firstCoach;
        this.secondCoach = secondCoach;
    }

    @GetMapping("/")
    public String getMethodName() {
        return "Comparing beans: firstCoach == secondCoach, " + (firstCoach == secondCoach);
    }

}
