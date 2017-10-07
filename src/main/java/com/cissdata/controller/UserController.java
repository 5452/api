package com.cissdata.controller;

import com.cissdata.entity.User;
import com.cissdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/verify", method = RequestMethod.GET)
    public User verify() {
        try {
            return userService.verifyUsernameAndPassword("dave", "secret");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }
}
