package com.zky.springboot.mydemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThymeleafController {

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloworld"; // "helloworld.html"
    }
    
}
