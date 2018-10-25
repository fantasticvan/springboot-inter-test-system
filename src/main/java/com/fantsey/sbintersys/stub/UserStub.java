package com.fantsey.intersys.stub;

import com.fantsey.intersys.bean.User;
import com.fantsey.intersys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fantsey
 * @date 2018/10/25
 */
@Component
public class UserStub {

    @Autowired
    private UserService userService;

    public User findByUsername(String username){
        return userService.findByUsername(username);
    }
}
