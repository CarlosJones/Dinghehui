package com.company.domain;

import javax.persistence.*;

/**
 * Created by admin on 2017/6/23.
 */
@Entity(name="t_employee")
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Company company;

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @ManyToOne
    @JoinColumn(name = "cid",referencedColumnName="company_id")
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Column(name="employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
