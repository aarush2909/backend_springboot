package com.example.demo.repo;

import com.example.demo.bureauData.BureauData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BureauDataRepo extends JpaRepository<BureauData, Integer> {
    void deleteBureauDataById(Integer id);
    public BureauData findBureauDataById(Integer id);
}
