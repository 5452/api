package com.cissdata.service;

import com.cissdata.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void TestVerifyUsernameAndPassword () throws Exception{
        String username = "dave";
        String password = "secret";

        User user = userService.verifyUsernameAndPassword(username, password);
        Assert.assertEquals(username, user.getUsername());
    }

}