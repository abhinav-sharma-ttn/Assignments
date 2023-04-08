package com.example.rest.webservices.demorestwebservices.hateoas_and_internationalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Locale;

@RestController
public class UserController {

    @Autowired
    UserDaoService userDaoService;

    MessageSource messageSource;

    public UserController(UserDaoService userDaoService, MessageSource messageSource) {
        this.userDaoService = userDaoService;
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/users")
    public ArrayList<User> retrieveAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users-internationalized")
    public String retrieveMessage() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",
                null, "default message", locale);
        // return "Hello World";
    }

    @GetMapping(path = "/greet-user")
    public String retrieveHelloUsername(@RequestParam String name) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("greet.hello",
                null, "default message", locale) + " " + name;

    }

    @GetMapping(path = "/users/{id}")
    public EntityModel<User> retrieveOneUser(@PathVariable int id) {
        User user = userDaoService.findOneUser(id);
        //return user;
        if (user == null) {
            throw new UserNotFoundException("No User Exist");
        }
        EntityModel<User> entityModel = EntityModel.of(user);

        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userDaoService.saveUserInList(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(int id) {
        userDaoService.deleteUserFromList(id);
    }
}
