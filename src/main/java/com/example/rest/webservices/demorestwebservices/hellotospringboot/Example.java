package com.example.rest.webservices.demorestwebservices.hellotospringboot;

public class Example {
    private String message;

    public Example(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
