package com.example.demo.service;

import com.example.demo.bureauData.BureauData;
import com.example.demo.form.Form;
import com.example.demo.repo.BureauDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BureauDataService {
    private BureauDataRepo bureauDataRepo;
    @Autowired
    public BureauDataService(BureauDataRepo bureauDataRepo){
        this.bureauDataRepo=bureauDataRepo;
    }

    public BureauData getBureauData(Form form){

        return this.bureauDataRepo.findBureauDataById(Integer.parseInt(form.getSsn()));
    }
    public BureauData getBureauDatabyid(Integer id){
        return this.bureauDataRepo.findBureauDataById(id);
    }


}

