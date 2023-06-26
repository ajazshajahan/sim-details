package com.example.sim.entity;

import javax.persistence.*;

@Table
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String cusLine1;

    @Column
    private String cusLine2;

    @Column
    private String cusName3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusLine1() {
        return cusLine1;
    }

    public void setCusLine1(String cusLine1) {
        this.cusLine1 = cusLine1;
    }

    public String getCusLine2() {
        return cusLine2;
    }

    public void setCusLine2(String cusLine2) {
        this.cusLine2 = cusLine2;
    }

    public String getCusName3() {
        return cusName3;
    }

    public void setCusName3(String cusName3) {
        this.cusName3 = cusName3;
    }
}
