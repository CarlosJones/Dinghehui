package com.school.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by admin on 2017/6/22.
 */
@Entity
public class Student {
    private long sID;
    private String sName;

    public Student() {
    }

    public Student(long sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    @Id
    @Column(name = "s_ID")
    public long getsID() {
        return sID;
    }

    public void setsID(long sID) {
        this.sID = sID;
    }

    @Basic
    @Column(name = "s_Name")
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sID != student.sID) return false;
        if (sName != null ? !sName.equals(student.sName) : student.sName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (sID ^ (sID >>> 32));
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        return result;
    }
}
