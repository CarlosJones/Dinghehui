package com.school.repository;

import com.school.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/22.
 */
public interface PersonRepository extends CrudRepository<Person,Long> {
    public Person findByPId(Long id);
}
