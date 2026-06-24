package com.rodolfodev.authapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class AuthController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
