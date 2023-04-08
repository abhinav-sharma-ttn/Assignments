package com.example.rest.webservices.demorestwebservices.hateoas_and_internationalization;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

@Component
public class UserDaoService {
    private static ArrayList<User> userArrayList = new ArrayList<User>();
    private static int noOfUser = 0;

    static {
        userArrayList.add(new User("Abhinav", ++noOfUser, LocalDate.now()));
        userArrayList.add(new User("Sharma", ++noOfUser, LocalDate.now()));
        userArrayList.add(new User("PQR", ++noOfUser, LocalDate.now()));
    }

    public ArrayList<User> findAll() {
        return userArrayList;
    }

    public User findOneUser(int id) {
        return userArrayList.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void saveUserInList(User user) {
        user.setId(++noOfUser);
        userArrayList.add(user);
    }

    public void deleteUserFromList(int id) {
        User user = userArrayList.stream()
                .filter(user1 -> user1.getId() == id)
                .findFirst()
                .orElse(null);
        if(user != null) {
           userArrayList.remove(user);
           noOfUser--;
        }
    }
}
