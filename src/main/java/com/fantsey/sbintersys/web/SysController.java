package com.fantsey.sbintersys.web;

import com.fantsey.sbintersys.bean.User;
import com.fantsey.sbintersys.stub.UserStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fantsey
 * @date 2018/10/25
 */

@Controller
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private UserStub userStub;

    @GetMapping("/findByUsername")
    @ResponseBody
    public User findByUsername(String username){
        return userStub.findByUsername(username);
    }

    @GetMapping("toLogin")
    public String toLogin(){
        return "sys/login";
    }

    @GetMapping("login")
    public String login(String username, String password){
        return "sys/index";
    }
}
