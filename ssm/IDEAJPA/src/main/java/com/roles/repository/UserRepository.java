package com.roles.repository;

import com.roles.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/26.
 */
public interface UserRepository extends CrudRepository<User,String> {
    public User findByName(String name);
}
