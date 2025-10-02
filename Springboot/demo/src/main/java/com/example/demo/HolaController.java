package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HolaController {

    @GetMapping("/")
    public String index () {
        return "index";
    }

    @GetMapping("/services")
    public String services () {
        return "services";
    }

    @GetMapping("/we")
    public String we () {
        return "we";
    }

    @GetMapping("/contact")
    public String contact () {
        return "contact";
    }

}
