package com.jpa.controller;

import com.jpa.entity.User;
import com.jpa.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by admin on 2017/6/20.
 */
@Controller
public class UserController {
    @Autowired
    UserDao userDao;
    @RequestMapping(value="/email")
    @ResponseBody
    public String getByEmail(@RequestParam(value = "email")String email) {
        String userId = null;
        User user = userDao.findByEmail(email);
        if (user != null) {
            userId = String.valueOf(user.getId());
            return "The user id is: " + userId;
        }
        return "user " + email + " is not exist.";
    }
    @RequestMapping("/url")
    @ResponseBody
    public String response(){
       return "接收到url请求";
    }
}
