package com.example.sim.service.impl;

import com.example.sim.dto.CustomerDTO;
import com.example.sim.dto.SimDTO;
import com.example.sim.entity.Customer;
import com.example.sim.entity.Sim;
import com.example.sim.repository.CustomerRepository;
import com.example.sim.repository.SimRepository;
import com.example.sim.service.SimService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class SimServiceImpl implements SimService {

    private final Logger log = LoggerFactory.getLogger(SimServiceImpl.class);


    private final SimRepository simRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public SimServiceImpl(final SimRepository simRepository,
                          final CustomerRepository customerRepository) {
        this.simRepository = simRepository;
        this.customerRepository = customerRepository;
    }


    @Override
    public boolean saveSim(SimDTO save) {

        List<CustomerDTO> customer;
        
        try {
            Sim simSaving = new Sim();
            
            simSaving.setName(save.getSimName());
            simSaving.setTakenTime(LocalDateTime.now());
            simSaving.setCustomers(saveCus(save.getCustomer()));

            simRepository.save(simSaving);
        }catch (Exception exp){
            log.error("Exception in save Sim" ,exp);
            throw new RuntimeException("Data Cannot Save Right Now");
        }
        return true;
    }

    private List<Customer> saveCus(List<CustomerDTO> customer) {

        List<Customer> cusEntity = new ArrayList<>();

        for (CustomerDTO customerDTO : customer){

            Customer customer1 = new Customer();

            customer1.setCusLine1(customerDTO.getCusLine1());
            customer1.setCusLine2(customerDTO.getCusLine2());
            customer1.setCusName3(customerDTO.getCusLine3());

            cusEntity.add(customer1);
        }
        customerRepository.saveAll(cusEntity);

        return cusEntity;
    }

}
