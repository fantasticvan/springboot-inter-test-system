package com.fantsey.intersys.service.impl;

import com.fantsey.intersys.bean.User;
import com.fantsey.intersys.dao.UserMapper;
import com.fantsey.intersys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fantsey
 * @date 2018/10/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
