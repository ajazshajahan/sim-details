package com.example.sim.entity;

import com.example.sim.dto.CustomerDTO;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table
@Entity
public class Sim {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDateTime takenTime;

    @ManyToMany
    private List<Customer> customers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTakenTime() {
        return takenTime;
    }

    public void setTakenTime(LocalDateTime takenTime) {
        this.takenTime = takenTime;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
