package com.dresapp.DressApp.controllers;


import com.dresapp.DressApp.model.users.User;
import com.dresapp.DressApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/all")
    public List<User> getUser(){
        return this.userService.getAll();
    }

    @RequestMapping(method = {RequestMethod.GET})
    public User getUser(@RequestParam(value="name") String name){
        return this.userService.getUser(name);
    }

}
