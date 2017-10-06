package com.cissdata.service.impl;

import com.cissdata.entity.User;
import com.cissdata.exception.UserNotFoundException;
import com.cissdata.repository.UserRepository;
import com.cissdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceTest implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User verifyUsernameAndPassword(String username, String password) throws Exception{
        User user = userRepository.getByUsername(username);

        if (user == null)
            throw new UserNotFoundException("username:" + username + ", password:" + password);
        return null;
    }
}
