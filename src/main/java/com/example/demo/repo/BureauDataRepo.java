package com.example.demo.repo;

import com.example.demo.bureauData.BureauData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface BureauDataRepo extends JpaRepository<BureauData, Integer> {
    void deleteBureauDataById(Integer id);
    public BureauData findBureauDataById(Integer id);
}
