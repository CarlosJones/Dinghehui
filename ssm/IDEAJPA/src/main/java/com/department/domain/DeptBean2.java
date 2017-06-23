package com.department.domain;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2017/6/23.
 */
@Entity (name="DEPT")                                   //对应表的名称
@GenericGenerator(name="genID", strategy="increment") //声明主键生成策略
public class DeptBean2 {
    @Id                                               //指定主键
    @GeneratedValue(generator="genID")                //设定主键生成策略
    @Column(name="ID")                                //指定类中的属性与表中的列的对应关系
    private long id;
    @Column(name="NAME")                              //指定类中的属性与表中的列的对应关系
    private String name;

    @OneToMany                                          //指定一对多关系
    @JoinColumn(name="dept_id")                       //指定与本类主键所对应的外表的外键
    private Set<EmployeeBean2> emp = new HashSet<EmployeeBean2>();
    @Override
    public String toString() {
        return "DeptBean [id=" + id + ", name=" + name +"]";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<EmployeeBean2> getEmp() {
        return emp;
    }
    public void setEmp(Set<EmployeeBean2> emp) {
        this.emp = emp;
    }
}
