package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @GetMapping("/")
    public String CrabbyRecipe(){
        return "CrabbyRecipe";
    }
    @GetMapping("/About")
    public String About(){
        return "About";
    }
}

