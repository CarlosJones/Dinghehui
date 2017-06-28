package com.roles.repository;

import com.roles.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/26.
 */
public interface RoleRepository extends CrudRepository<Role,String> {
    public Role findByName(String name);
}
