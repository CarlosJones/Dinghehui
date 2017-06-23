package com.company.repository;

import com.company.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/23.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    public Employee findByEmployeeId(Integer id);
}
