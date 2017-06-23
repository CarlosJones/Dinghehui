package com.customer.domain;

import javax.persistence.*;

/**
 * Created by admin on 2017/6/23.
 */
@Entity(name="Oneorder")
public class Order {
    private Integer id;
    private String bianhao;
    private Customer customer;

    public Order() {
    }

    @ManyToOne
    @JoinColumn(name="c_id")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="order_bianhao")
    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }
}
