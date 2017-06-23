package com.department.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by admin on 2017/6/23.
 */
@Entity(name="employee")                               //指定一个实体对应表的名称
@GenericGenerator(name="genID", strategy="increment") //声明主键生成策略
public class EmployeeBean2 {
    @Id                                               //指定主键
    @GeneratedValue(generator="genID")                //设定主键生成策略
    @Column(name="ID")                                //类中的属性和表中的列名的对应关系
    private long id;
    @Column(name="NAME")
    private String name;
    @Column(name="SEX")
    private String sex;
    @Column(name="JOB")
    private String job;
    @ManyToOne                                          //指定多对一关系
    @JoinColumn(name="DEPT_ID")
    //一个员工对应于一个部门号，所以这里不用集合
    private DeptBean2 dept ;                          //注意这个地方不要new对象，否则会无法运行
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public DeptBean2 getDept() {
        return dept;
    }
    public void setDept(DeptBean2 dept) {
        this.dept = dept;
    }
    @Override
    public String toString() {
        return "EmployeeBean [id=" + id + ", name=" + name + ", sex=" + sex
                + ", job=" + job + ", dept=" + dept
                + "]";
    }
}
