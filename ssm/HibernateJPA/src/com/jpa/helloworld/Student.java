package com.jpa.helloworld;

import sun.nio.cs.Surrogate;

import javax.persistence.*;

/**
 * Created by admin on 2017/6/16.
 */
@Entity(name="student")
public class Student {
    private Integer ID;
    private String name;
    private String className;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
