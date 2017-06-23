package com.company.repository;

import com.company.domain.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 2017/6/23.
 */
public interface CompanyRepository extends CrudRepository<Company,Integer> {
    public Company findByCompanyId(Integer id);
}
