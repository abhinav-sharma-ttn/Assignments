package com.example.rest.webservices.demorestwebservices.hateoas_and_internationalization;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User {

    @Size(min = 2, message = "Name should be of more than 2 characters.")
    // @JsonProperty("user_name")
    //@JsonIgnore
    private String name;

    private int id;

    private LocalDate dob;

    public User(String name, int id, LocalDate dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
