package com.ojas.oauth2springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Home() {
        return "Hello, unsecured!";
    }

    @GetMapping("/secured")
    public String Secured() {
        return "Hello, secured!";
    }

}
