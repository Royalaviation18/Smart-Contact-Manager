package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Locked.Read;

@Controller
public class Pagecontroller {
 
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name", "Spring Boot");
        model.addAttribute("creator", "Rohit");
        model.addAttribute("githubRepo", "https://github.com/Royalaviation18/Smart-Contact-Manager");
        return "home";
    }
}