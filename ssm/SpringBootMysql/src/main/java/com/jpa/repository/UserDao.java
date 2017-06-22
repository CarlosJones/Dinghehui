package com.jpa.repository;

import com.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by admin on 2017/6/20.
 */
@Transactional
public interface UserDao extends CrudRepository<User,Long> {
    public User findByEmail(String email);
}
