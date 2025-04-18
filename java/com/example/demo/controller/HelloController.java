package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/web/message")
    public String getMessage(Model model) {
        model.addAttribute("message", "Hello, World!");
        System.out.println("after");
        return "hello";
    }
}
