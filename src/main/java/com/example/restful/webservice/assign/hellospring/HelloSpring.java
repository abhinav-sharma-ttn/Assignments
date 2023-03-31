package com.example.restful.webservice.assign.hellospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {

    @GetMapping(path = "/welcome-spring")
    public String hello() {
        return "Welcome to spring boot";
    }
}
