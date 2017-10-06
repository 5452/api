package com.cissdata.service;

import com.cissdata.entity.User;

public interface UserService {

    User verifyUsernameAndPassword (String username, String password) throws Exception;
}
