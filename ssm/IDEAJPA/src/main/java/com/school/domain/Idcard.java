package com.school.domain;

import javax.persistence.*;

/**
 * Created by admin on 2017/6/22.
 */
@Entity
public class Idcard {
    private Long cId;
    private String id;
    private Person person;

    @OneToOne
    @JoinColumn(name="person_id",referencedColumnName = "p_id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Idcard() {
    }

    public Idcard(Long cId, String id) {
        this.cId = cId;
        this.id = id;
    }

    @Id
    @Column(name = "c_id")
    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Idcard idcard = (Idcard) o;

        if (cId != null ? !cId.equals(idcard.cId) : idcard.cId != null) return false;
        if (id != null ? !id.equals(idcard.id) : idcard.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId != null ? cId.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
