package com.school.repository;

import com.school.domain.Idcard;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/22.
 */
public interface IdcardRepository extends CrudRepository<Idcard,Long> {
    public Idcard findByCId(Long id);
}
