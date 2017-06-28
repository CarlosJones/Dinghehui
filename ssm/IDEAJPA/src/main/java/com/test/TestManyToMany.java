package com.test;

import com.roles.domain.Role;
import com.roles.domain.User;
import com.roles.repository.RoleRepository;
import com.roles.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by admin on 2017/6/26.
 */
@Configuration
public class TestManyToMany {
    private static final Logger log = LoggerFactory.getLogger(TestManyToMany.class);
    public CommandLineRunner testSave(UserRepository userRepository, RoleRepository roleRepository){
        return (args)->{
            User user=new User();
            user.setName("张三");
            
            Role role=new Role();
            role.setName("管理员");
            Set<Role> roles=new HashSet<Role>();
            roles.add(role);
            user.setRoles(roles);

            roleRepository.save(role);
            userRepository.save(user);
        };
    }

    public CommandLineRunner testQuery1(UserRepository userRepository){
        return args -> {
            User u = userRepository.findByName("张三");
            Set<Role> roleSet= u.getRoles();
            Iterator<Role> rIt = roleSet.iterator();
            while(rIt.hasNext()){
                Role r = rIt.next();
                log.info("--------"+r.getName()+"-----------");
            }
        };
    }
    @Bean
    public CommandLineRunner testQuery2(RoleRepository roleRepository){
        return args -> {
            Role r = roleRepository.findByName("管理员");
            Set<User> userSet = r.getUsers();
            Iterator<User> it = userSet.iterator();
            while(it.hasNext()){
                User u = it.next();
                log.info("-----------"+u.getName()+"-------------");
            }
        };
    }
}
