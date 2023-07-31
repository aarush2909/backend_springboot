package com.example.demo.service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.form.Form;
import com.example.demo.repo.FormDataRepo;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bureauData.BureauData;
import java.time.LocalDate;
import java.util.List;
import com.example.demo.repo.BureauDataRepo;
import com.example.demo.service.BureauDataService;


import java.util.UUID;

@Service
@Transactional
public class FormService {
    private final FormDataRepo formDataRepo;

    private final BureauDataService bureauDataService;
    private final BureauDataRepo bureauDataRepo;

    //    private final Integer a= new Integer();

    @Autowired
    public FormService(FormDataRepo formDataRepo, BureauDataService bureauDataService, BureauDataRepo bureauDataRepo ) {
        this.formDataRepo = formDataRepo;
        this.bureauDataRepo=bureauDataRepo;
        this.bureauDataService=bureauDataService;

    }

    public Form addForm(Form form){
        //form.setSsn(UUID.randomUUID());

        LocalDate currentDate = LocalDate.now();
        form.setDate(currentDate.toString());

        BureauData data_2= this.bureauDataRepo.findBureauDataById(Integer.parseInt(form.getSsn()));
        form.setReason(data_2.getEarliest_cr_line());

        return formDataRepo.save(form);
    }

    public List<Form> findAllForms(){

//        System.out.println();

        return formDataRepo.findAll();
    }

    public Form updateForm(Form form){
        return formDataRepo.save(form);
    }

    public Form findFormById(Long id){
        return formDataRepo.findFormById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteForm(Long id){
        formDataRepo.deleteFormById(id);
    }

}
