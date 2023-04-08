package com.example.rest.webservices.demorestwebservices.filtering.entities;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("DynamicFilter")
public class NewUser {
    private String name;

    //@JsonIgnore
    private String password;
    private int id;

    public NewUser(String name, String password, int id) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
