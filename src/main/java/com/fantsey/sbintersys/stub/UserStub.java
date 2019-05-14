package com.fantsey.sbintersys.stub;

import com.fantsey.sbintersys.bean.User;
import com.fantsey.sbintersys.common.JsonResult;
import com.fantsey.sbintersys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author fantsey
 * @date 2018/10/25
 */
@Component
public class UserStub {

    @Autowired
    private UserService userService;

    public JsonResult findByUsername(String username){
        User user = userService.findByUsername(username);
        JsonResult jr = new JsonResult();
        jr.setMsg("用户信息");
        jr.setSuccess(Boolean.TRUE);
        jr.setData(user);
        return jr;
    }

    public JsonResult findAllUsers() {
        List<User> user = userService.findAllUsers();
        JsonResult jr = new JsonResult();
        jr.setMsg("用户信息");
        jr.setSuccess(Boolean.TRUE);
        jr.setData(user);
        return jr;
    }
}
