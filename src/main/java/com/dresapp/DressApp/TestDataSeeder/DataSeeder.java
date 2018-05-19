package com.dresapp.DressApp.TestDataSeeder;

import com.dresapp.DressApp.model.users.UserInfo;
import com.dresapp.DressApp.model.users.User;
import com.dresapp.DressApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DataSeeder(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        User user1 = new User.Builder().userName("Agustin").password("putoelquelee").person(new UserInfo.Builder().age(20).build()).build();
        User user2 = new User.Builder().userName("Nicolas").password("agusgroso").person(new UserInfo.Builder().address("lejos999").build()).build();

        //Borro toda la data actual para que no se agregue cada vez que arranco la aplicacion.
        this.userRepository.deleteAll();

        //Agrego a los usuarios
        List<User> userList = Arrays.asList(user1, user2);
        this.userRepository.saveAll(userList);
    }
}
