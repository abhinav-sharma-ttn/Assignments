package com.example.rest.webservices.demorestwebservices.versioning.service;

import com.example.rest.webservices.demorestwebservices.versioning.entities.PersonV1;
import com.example.rest.webservices.demorestwebservices.versioning.entities.PersonV2;
import org.springframework.stereotype.Component;

@Component
public class DaoServicePerson {

    public PersonV1 getPersonV1Object() {
        return new PersonV1("Abhinav Sharma", 21);
    }

    public PersonV2 getPersonV2Object() {
        return new PersonV2("Abhinav", "Sharma", 21, 100);
    }

}
