package com.school.repository;

import com.school.domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/22.
 */
public interface StudentRepository extends CrudRepository<Student,Integer> {
    public Student findBySID(Long sID);
}
