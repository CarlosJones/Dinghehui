package com.jpa;

import com.jpa.entity.User;
import com.jpa.repository.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2017/6/21.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = JpaApplication.class)
public class TestUser {
    @Autowired
    private UserDao dao;
    @Test
    public void addUser(){
        User u = new User();
        u.setEmail("u-email");
        u.setName("try");
        dao.save(u);
    }
}
