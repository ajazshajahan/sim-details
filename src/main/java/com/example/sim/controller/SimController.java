package com.example.sim.controller;

import com.example.sim.dto.SimDTO;
import com.example.sim.service.SimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimController {


    private final SimService simService;

    @Autowired
    public SimController(final SimService simService) {
        this.simService = simService;
    }

    @PostMapping("/save/sim")
    boolean saveSims(@RequestBody SimDTO save){
        return simService.saveSim(save);
    }
}
