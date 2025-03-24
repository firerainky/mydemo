package com.zky.springboot.mydemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ThymeleafController {

    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("theDate", java.time.LocalDateTime.now());
        return "time"; // "helloworld.html"
    }
    
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}


