package com.example.rest.webservices.demorestwebservices.filtering.services;

import com.example.rest.webservices.demorestwebservices.filtering.entities.NewUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DaoServiceNewUser {

    ArrayList<NewUser> userArrayList = new ArrayList<>();
    public NewUser getNewUser() {
        return new NewUser("Abhinav", "1234asdf", 12);
    }

    public NewUser getParticularUserFromList(int id) {
        return userArrayList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }



    public void saveNewUserInList(NewUser user) {
        userArrayList.add(user);
    }
}
