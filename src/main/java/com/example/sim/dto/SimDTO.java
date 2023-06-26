package com.example.sim.dto;

import com.example.sim.entity.Customer;

import java.time.LocalDateTime;
import java.util.List;

public class SimDTO {


    private Long id;

    private String simName;

    private LocalDateTime takenTime;

    private List<CustomerDTO> customer;

    public String getSimName() {
        return simName;
    }

    public void setSimName(String simName) {
        this.simName = simName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTakenTime() {
        return takenTime;
    }

    public void setTakenTime(LocalDateTime takenTime) {
        this.takenTime = takenTime;
    }

    public List<CustomerDTO> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerDTO> customer) {
        this.customer = customer;
    }
}
