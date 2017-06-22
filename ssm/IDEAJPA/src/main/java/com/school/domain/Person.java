package com.school.domain;

import javax.persistence.*;

/**
 * Created by admin on 2017/6/22.
 */
@Entity
public class Person {
    private Long pId;
    private Idcard idCard;

    public Person() {
    }

    public Person(Long pId) {
        this.pId = pId;
    }

    @Id
    @Column(name = "p_id")
    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (pId != null ? !pId.equals(person.pId) : person.pId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return pId != null ? pId.hashCode() : 0;
    }

    @OneToOne
    @JoinColumn(name = "card_id", referencedColumnName = "c_id")
    public Idcard getIdCard() {
        return idCard;
    }

    public void setIdCard(Idcard idCard) {
        this.idCard = idCard;
    }
}
