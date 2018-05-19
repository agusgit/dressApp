package com.dresapp.DressApp.services;

import com.dresapp.DressApp.model.users.User;
import com.dresapp.DressApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    public User getUser(String name) {
        return this.userRepository.findByUserName(name);
    }


}
