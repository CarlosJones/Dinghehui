package com.customer.repository;

import com.customer.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/23.
 */
public interface CustomerRepositroy extends CrudRepository<Customer,Integer>{
}
