package com.example.rest.webservices.demorestwebservices.versioning.controller;

import com.example.rest.webservices.demorestwebservices.versioning.entities.PersonV1;
import com.example.rest.webservices.demorestwebservices.versioning.entities.PersonV2;
import com.example.rest.webservices.demorestwebservices.versioning.service.DaoServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    DaoServicePerson daoServicePerson;


    // URI versioning
    @GetMapping(path = "/v1/person")
    public PersonV1 getPersonV1() {
        return daoServicePerson.getPersonV1Object();
    }

    @GetMapping(path = "/v2/person")
    public PersonV2 getPersonV2() {
        return daoServicePerson.getPersonV2Object();
    }

    // Request Param versioning
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getPersonV1UsingRequestParams() {
        return daoServicePerson.getPersonV1Object();
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getPersonV2UsingRequestParams() {
        return daoServicePerson.getPersonV2Object();
    }

    // Custom Header versioning
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getPersonV1UsingCustomHeader() {
        return daoServicePerson.getPersonV1Object();
    }

    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getPersonV2UsingCustomHeader() {
        return daoServicePerson.getPersonV2Object();
    }

    // Media type/ accept header/ content negotiation versioning
    @GetMapping(path = "/person/accept", produces = "application/.vnd.company.app-v1+json")
    public PersonV1 getPersonV1UsingMediaType() {
        return daoServicePerson.getPersonV1Object();
    }

    @GetMapping(path = "/person/accept", produces = "application/.vnd.company.app-v2+json")
    public PersonV2 getPersonV2UsingMediaType() {
        return daoServicePerson.getPersonV2Object();
    }


}
