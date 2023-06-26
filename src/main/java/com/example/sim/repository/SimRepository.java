package com.example.sim.repository;

import com.example.sim.entity.Sim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimRepository extends JpaRepository<Sim,Long> {
}
