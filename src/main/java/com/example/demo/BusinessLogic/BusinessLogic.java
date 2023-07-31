package com.example.demo.BusinessLogic;

import com.example.demo.bureauData.BureauData;
import com.example.demo.form.Form;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import javax.lang.model.type.NullType;
import java.util.Arrays;
import java.util.List;

@Service
public class BusinessLogic {

    private final double weights[]= {-2.20408076e-01 ,-1.42926180e-01 ,-2.68116198e-02 ,-2.27721551e-01,
            -1.08300765e-01 , 6.13341050e-02 , 1.20333499e-01 ,-2.28785662e-02,
            -4.42841263e-02 , 2.67397355e-03   ,  3.44940787e-03 ,1.23673860e-01,
            1.90940960e-01 ,-1.11393373e-03 , 3.50093823e-02 ,-4.62756024e-02,
            1.14249860e+00 ,-1.68911989e-02  , 4.08142876e-03 , 1.10443141e+00,
            -4.95102831e-02 , 5.92655514e-02 ,-2.10216684e-01 , 1.63057199e-01, -0.80423101};

    private double para[]= new double[25];
    public BusinessLogic(){
        para[24]=1;

        for(int inx=0;inx<24;inx++) para[inx]=0;
    }


    public void getScore(Form form, BureauData bureauData){
        setParaDescription(form.getDescription());

        if(bureauData.getId()!=null)setParaBureaData(bureauData);



        setParaEarliestCr(bureauData.getEarliest_cr_line(),form.getDate());

        setParaFormData(form);

        form.setScore((int) getScoreValue());
        if(form.getScore()>400)form.setStatus("Accepted");
        else form.setStatus("Decline");
        form.setReason("java chutiya hai");





    }
    private void setParaDescription(String des){

    }
    private void setParaBureaData(BureauData bureauData){
        para[11]=bureauData.getDelinq_2yrs();
        para[12]=bureauData.getInq_last_6mths();
        para[13]=bureauData.getMths_since_last_delinq();
        para[14]=bureauData.getOpen_acc();
        para[15]=bureauData.getRevol_bal()/10000.0;
        para[16]=bureauData.getRevol_util();
        para[17]=bureauData.getTotal_acc();

    }
    private void setParaEarliestCr(String past, String current){
        int x1=Integer.parseInt(past.substring(5,9));
        int x2=Integer.parseInt(current.substring(0,4));
//        System.out.println(x1 + " " + x2);
        para[10]=x2-x1;
    }

    private void setParaFormData(Form form){

        para[18]= Integer.parseInt(form.getExperienceYears());

        double d_2=Double.parseDouble(form.getAnnualSalary());
        double d_1=Double.parseDouble(form.getLoanAmount());
        para[19]= d_1/d_2;
        System.out.println(d_1 + " " +  d_2);

        String purpose =form.getLoanPurpose();
        System.out.println(purpose);
        if(purpose.equals("Debt")) para[20]=1;
        if(purpose.equals("Educational Loan")) para[21]=1;
        if(purpose.equals("Personal Loan")) para[22]=1;

        if(purpose.equals("Home Loan")) para[23]=1;


    }
    private int getScoreValue(){
       double expo=0;
       for(int inx=0;inx<25;inx++){
           System.out.println(para[inx]+" "+ weights[inx]);
           expo+=para[inx]*weights[inx];
       }

       double denominator =1+Math.exp(-expo);
       double probability= 1-(1.0/denominator);
       System.out.println(denominator+ " " + probability);
       return (int)(probability*1000);
    }




}
