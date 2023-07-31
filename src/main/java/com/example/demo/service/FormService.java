package com.example.demo.service;
import com.example.demo.BusinessLogic.BusinessLogic;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.form.Form;
import com.example.demo.repo.FormDataRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bureauData.BureauData;
import java.time.LocalDate;
import java.util.List;
import com.example.demo.repo.BureauDataRepo;


@Service
@Transactional
public class FormService {
    private final FormDataRepo formDataRepo;

    private final BureauDataService bureauDataService;
    private final BureauDataRepo bureauDataRepo;

    private final BusinessLogic businessLogic;

    //    private final Integer a= new Integer();

    @Autowired
    public FormService(FormDataRepo formDataRepo, BureauDataService bureauDataService, BureauDataRepo bureauDataRepo, BusinessLogic businessLogic ) {
        this.formDataRepo = formDataRepo;
        this.bureauDataRepo=bureauDataRepo;
        this.bureauDataService=bureauDataService;
        this.businessLogic=businessLogic;

    }

    public Form addForm(Form form){
        //form.setSsn(UUID.randomUUID());

        LocalDate currentDate = LocalDate.now();
        form.setDate(currentDate.toString());
//      it was not working when i was passing form in the getBureaudata but here i have passing id directly
//      check the reason behind it why this was happening

        Integer id=Integer.parseInt(form.getSsn());
        BureauData b1=this.bureauDataService.getBureauData(id);

        this.businessLogic.getScore(form,b1);





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
