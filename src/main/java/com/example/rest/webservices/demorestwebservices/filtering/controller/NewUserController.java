package com.example.rest.webservices.demorestwebservices.filtering.controller;


import com.example.rest.webservices.demorestwebservices.filtering.entities.NewUser;
import com.example.rest.webservices.demorestwebservices.filtering.services.DaoServiceNewUser;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewUserController {

    @Autowired
    DaoServiceNewUser daoServiceNewUser;
    @GetMapping(path = "/new-users")
    public NewUser getNewUser() {
        return daoServiceNewUser.getNewUser();
    }

    @GetMapping(path = "/new-user/{id}")
    public NewUser getParticularUse(@PathVariable int id) {
        return daoServiceNewUser.getParticularUserFromList(id);
    }

    @GetMapping(path = "/new-user-df/{id}")
    public MappingJacksonValue getParticularUserDynamicFiltering(@PathVariable int id) {
        NewUser user =  daoServiceNewUser.getParticularUserFromList(id);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(user);

        // name and id is allowed and password is blocked
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "id");
        FilterProvider filters = new SimpleFilterProvider().addFilter("DynamicFilter", filter);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

    @PostMapping(path = "/new-users")
    public void saveNewUser(@RequestBody NewUser user) {
        daoServiceNewUser.saveNewUserInList(user);
    }

}
