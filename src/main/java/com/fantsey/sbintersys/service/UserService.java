package com.fantsey.sbintersys.service;

import com.fantsey.sbintersys.bean.User;

public interface UserService {
    User findByUsername(String username);
}
