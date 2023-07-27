package com.example.demo.form;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;


@Entity

public class Form implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;

    private String middleName;

    private String lastName;

    private String dob;

    private String maritalStatus;

    private String ssn;

    private String loanAmount;

    private String loanPurpose;

    private String description;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String postalCode;

    private String homePhone;

    private String officePhone;

    private String mobileNumber;

    private String email;

    private String employerName;

    private String annualSalary;

    private String experienceYears;

    private String experienceMonths;

    private String designation;

    private String employerAddressLine1;

    private String employerAddressLine2;

    private String employerCity;

    private String employerState;

    private String employerPostalCode;

    private String status;
    private Integer score;
    private String reason;
    private String date;


    public Form() {
    }

    public Form(Long id, String firstName, String middleName, String lastName, String dob, String maritalStatus,
                String ssn, String loanAmount, String loanPurpose, String description, String addressLine1,
                String addressLine2, String city, String state, String postalCode, String homePhone, String officePhone,
                String mobileNumber, String email, String employerName, String annualSalary, String experienceYears,
                String experienceMonths, String designation, String employerAddressLine1, String employerAddressLine2,
                String employerCity, String employerState, String employerPostalCode, String status, Integer score,
                String reason, String date) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.maritalStatus = maritalStatus;
        this.ssn = ssn;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;
        this.description = description;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.homePhone = homePhone;
        this.officePhone = officePhone;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.employerName = employerName;
        this.annualSalary = annualSalary;
        this.experienceYears = experienceYears;
        this.experienceMonths = experienceMonths;
        this.designation = designation;
        this.employerAddressLine1 = employerAddressLine1;
        this.employerAddressLine2 = employerAddressLine2;
        this.employerCity = employerCity;
        this.employerState = employerState;
        this.employerPostalCode = employerPostalCode;
        this.status = status;
        this.score = score;
        this.reason = reason;
        this.date = date;
    }

    public Form(String firstName, String middleName, String lastName, String dob, String maritalStatus, String ssn,
                String loanAmount, String loanPurpose, String description, String addressLine1, String addressLine2,
                String city, String state, String postalCode, String homePhone, String officePhone, String mobileNumber,
                String email, String employerName, String annualSalary, String experienceYears, String experienceMonths,
                String designation, String employerAddressLine1, String employerAddressLine2, String employerCity,
                String employerState, String employerPostalCode, String status, Integer score, String reason) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dob = dob;
        this.maritalStatus = maritalStatus;
        this.ssn = ssn;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;
        this.description = description;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.homePhone = homePhone;
        this.officePhone = officePhone;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.employerName = employerName;
        this.annualSalary = annualSalary;
        this.experienceYears = experienceYears;
        this.experienceMonths = experienceMonths;
        this.designation = designation;
        this.employerAddressLine1 = employerAddressLine1;
        this.employerAddressLine2 = employerAddressLine2;
        this.employerCity = employerCity;
        this.employerState = employerState;
        this.employerPostalCode = employerPostalCode;
        this.status = status;
        this.score = score;
        this.reason = reason;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(String annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(String experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getExperienceMonths() {
        return experienceMonths;
    }

    public void setExperienceMonths(String experienceMonths) {
        this.experienceMonths = experienceMonths;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployerAddressLine1() {
        return employerAddressLine1;
    }

    public void setEmployerAddressLine1(String employerAddressLine1) {
        this.employerAddressLine1 = employerAddressLine1;
    }

    public String getEmployerAddressLine2() {
        return employerAddressLine2;
    }

    public void setEmployerAddressLine2(String employerAddressLine2) {
        this.employerAddressLine2 = employerAddressLine2;
    }

    public String getEmployerCity() {
        return employerCity;
    }

    public void setEmployerCity(String employerCity) {
        this.employerCity = employerCity;
    }

    public String getEmployerState() {
        return employerState;
    }

    public void setEmployerState(String employerState) {
        this.employerState = employerState;
    }

    public String getEmployerPostalCode() {
        return employerPostalCode;
    }

    public void setEmployerPostalCode(String employerPostalCode) {
        this.employerPostalCode = employerPostalCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", ssn='" + ssn + '\'' +
                ", loanAmount='" + loanAmount + '\'' +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", description='" + description + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", employerName='" + employerName + '\'' +
                ", annualSalary='" + annualSalary + '\'' +
                ", experienceYears='" + experienceYears + '\'' +
                ", experienceMonths='" + experienceMonths + '\'' +
                ", designation='" + designation + '\'' +
                ", employerAddressLine1='" + employerAddressLine1 + '\'' +
                ", employerAddressLine2='" + employerAddressLine2 + '\'' +
                ", employerCity='" + employerCity + '\'' +
                ", employerState='" + employerState + '\'' +
                ", employerPostalCode='" + employerPostalCode + '\'' +
                ", status='" + status + '\'' +
                ", score=" + score +
                ", reason='" + reason + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
