package com.test;

import com.Application;
import com.customer.domain.Customer;
import com.customer.domain.Order;
import com.customer.repository.CustomerRepositroy;
import com.customer.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2017/6/23.
 */
@Configuration
public class TestOneToMany {
    public static final Logger log = LoggerFactory.getLogger(Application.class);
    @Bean
    public CommandLineRunner TestOneToMany(CustomerRepositroy customerRepositroy, OrderRepository orderRepository){
        return (args)->{
            Customer customer = new Customer();
            customer.setName("吕洞宾");
            Order order1 = new Order();
            order1.setBianhao("da_bao_jian");
            Order order2 = new Order();
            order2.setBianhao("xian_dan");
            customer.getOrders().add(order1);
            customer.getOrders().add(order2);
            orderRepository.save(order1);
            orderRepository.save(order2);
            customerRepositroy.save(customer);
        };
    }
}
