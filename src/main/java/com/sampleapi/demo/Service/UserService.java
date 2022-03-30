package com.sampleapi.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String welcomeNewUser(String name){
        return "Welcome my friend " + name;
    }
}
