package com.sampleapi.demo.Controller;

import com.sampleapi.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class userController {

    @Autowired
    private UserService userService;

    @GetMapping("/new-user")
    public String getUserAddPage(
            @RequestHeader("name") String name
            ) {
        String welcomeMessage = userService.welcomeNewUser(name);
        return welcomeMessage;
    }

}
