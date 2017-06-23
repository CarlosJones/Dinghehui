package com;

import com.company.domain.Company;
import com.company.domain.Employee;
import com.company.repository.CompanyRepository;
import com.company.repository.EmployeeRepository;
import com.customer.domain.Customer;
import com.customer.domain.Order;
import com.customer.repository.CustomerRepositroy;
import com.customer.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by admin on 2017/6/22.
 */
@SpringBootApplication
public class Application {
    public static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

//    @Bean
//    public CommandLineRunner demo(StudentRepository studentRepository){
//        return (args)->{
//            studentRepository.save(new Student(1L,"李四"));
//            Student stu = studentRepository.findBySID(1L);
//            log.info(stu.getsName());
//            stu.setsName("章三");
//            studentRepository.save(stu);
//        };
//    }
}
