package com.fantsey.intersys.service;

import com.fantsey.intersys.bean.User;

public interface UserService {
    User findByUsername(String username);
}
