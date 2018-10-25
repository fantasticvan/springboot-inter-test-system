package com.fantsey.sbintersys.service.impl;

import com.fantsey.sbintersys.bean.User;
import com.fantsey.sbintersys.dao.UserMapper;
import com.fantsey.sbintersys.service.UserService;
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
