package com.example.rest.webservices.demorestwebservices.hellotospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping(method = RequestMethod.GET, path = "/hello-springboot")
//    public String retrieveHelloToSpringBoot() {
//        return "Welcome to Spring boot";
//    }

    @GetMapping(path = "/hello-springboot")
    public String retrieveHelloToSpringBoot() {
        return "Welcome to Spring boot";
    }

    @GetMapping(path = "/example-object")
    public Example retrieveExampleObject() {
        Example example = new Example("Example Object");
        return example;
    }
}
