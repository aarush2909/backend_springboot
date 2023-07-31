package com.example.demo;

import com.example.demo.bureauData.BureauData;
import com.example.demo.form.Form;
import com.example.demo.repo.BureauDataRepo;
import com.example.demo.services.BureauDataService;
import com.example.demo.services.FormService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/form")
public class FormResource {
    private final FormService formService;
    private final BureauDataRepo bureauDataRepo;
    private final BureauDataService bureauDataService;

    public FormResource(FormService formService , BureauDataRepo bureauDataRepo, BureauDataService bureauDataService) {
        this.formService = formService;
        this.bureauDataRepo=bureauDataRepo;
        this.bureauDataService=bureauDataService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Form>> getAllForms(){
        List<Form> forms = formService.findAllForms();
        return new ResponseEntity<>(forms, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Form> getFormById(@PathVariable("id") Long id){
        Form form = formService.findFormById(id);
        return new ResponseEntity<>(form, HttpStatus.OK);
    }

    @PostMapping("/add")
//    @CrossOrigin(originPatterns = "http://localhost:4200/landing-page1")
    public ResponseEntity<Form> addForm(@RequestBody Form form){

        Form newForm = formService.addForm(form);

        return new ResponseEntity<>(newForm, HttpStatus.CREATED);

    }

    @PutMapping("/update")
    public ResponseEntity<Form> updateForm(@RequestBody Form form){
        Form updateForm = formService.updateForm(form);
        return new ResponseEntity<>(updateForm, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteForm(@PathVariable("id") Long id){
        formService.deleteForm(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/bureaudata")
    public ResponseEntity<List<BureauData>> getAllBureauData(){

//        BureauDataRepo bureauDataRepo;

        List<BureauData> bureaudatas = this.bureauDataRepo.findAll();


        return new ResponseEntity<>(bureaudatas, HttpStatus.OK);
    }

    @GetMapping("/find/bureaudata/{id}")
    public ResponseEntity<BureauData> getBureauDataById(@PathVariable("id") Integer id){
        BureauData data_1 = this.bureauDataService.getBureauDatabyid(id);
//        System.out.println(data_1);
        return new ResponseEntity<>(data_1, HttpStatus.OK);
    }

}
