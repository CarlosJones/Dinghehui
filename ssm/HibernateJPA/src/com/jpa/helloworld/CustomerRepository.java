package com.jpa.helloworld;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/16.
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);
}
