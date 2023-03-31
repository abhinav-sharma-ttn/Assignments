package com.example.springboot.assign.demo.springboot.assignw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonServiceConfiguration personService;

    public PersonController(PersonServiceConfiguration personService) {
        this.personService = personService;
    }

    @GetMapping("/person-configuration")
    public PersonServiceConfiguration retrieveInformation() {
        return personService;
    }
}
