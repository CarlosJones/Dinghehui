package com.customer.repository;

import com.customer.domain.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/23.
 */
public interface OrderRepository extends CrudRepository<Order,Integer> {
}
