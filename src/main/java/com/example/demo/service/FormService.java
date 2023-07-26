package com.example.demo.service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.form.Form;
import com.example.demo.repo.FormDataRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class FormService {
    private final FormDataRepo formDataRepo;

    @Autowired
    public FormService(FormDataRepo formDataRepo) {
        this.formDataRepo = formDataRepo;
    }

    public Form addForm(Form form){
        //form.setSsn(UUID.randomUUID());
        LocalDate currentDate = LocalDate.now();
        form.setDate(currentDate.toString());
        form.setScore(700);
        return formDataRepo.save(form);
    }

    public List<Form> findAllForms(){
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
