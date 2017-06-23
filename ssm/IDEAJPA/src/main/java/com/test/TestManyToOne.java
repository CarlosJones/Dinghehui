package com.test;

import com.company.domain.Company;
import com.company.domain.Employee;
import com.company.repository.CompanyRepository;
import com.company.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by admin on 2017/6/23.
 */
public class TestManyToOne {
    public static final Logger log = LoggerFactory.getLogger(TestManyToOne.class);
    @Bean
    public CommandLineRunner TestManyToOne(CompanyRepository companyRepository, EmployeeRepository employeeRepository) {
        return (args) -> {
//            测试保存功能
//            Company company = new Company();
//            company.setCompanyName("鼎合汇");
//            Employee employee1 = new Employee();
//            employee1.setEmployeeName("李雷");
//            employee1.setCompany(company);
//            Employee employee2 = new Employee();
//            employee2.setEmployeeName("韩梅梅");
//            employee2.setCompany(company);
//            company.getEmployees().add(employee1);
//            company.getEmployees().add(employee2);
//            companyRepository.save(company);
//            employeeRepository.save(employee1);
//            employeeRepository.save(employee2);

//            测试一对应实体找多的实体, 因为是多对一关联，所以一的一端找不到多的一端。
//            Company company = companyRepository.findByCompanyId(1);
//            Set<Employee> employeeSet = company.getEmployees();
//            Iterator<Employee> it = employeeSet.iterator();
//            while (it.hasNext()) {
//                Employee e = it.next();
//                log.info("-----" + e.getEmployeeName() + "---------");
//            }

//            测试多的实体找一的实体，可以找到。
            Employee employee = employeeRepository.findByEmployeeId(2);
            log.info("------" + employee.getEmployeeName() + "----------");
            Company company = employee.getCompany();
            log.info("-------" + company.getCompanyName() + "-----------");
        };
    }
}
