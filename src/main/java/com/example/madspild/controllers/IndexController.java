package com.example.madspild.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String frontPage(){return "frontPage";}

    @GetMapping("/about")
    public String about(){return "about";}

    @GetMapping("/links")
    public String links(){return "links";}

    @GetMapping("/stats")
    public String stats(){return "stats";}


}
