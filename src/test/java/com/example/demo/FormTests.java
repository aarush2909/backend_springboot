package com.example.demo;
import com.example.demo.form.Form;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FormTests {

    @Test
    public void testGettersAndSetters() {
        // Create a Form object
        Form form = new Form();

        // Set values using setters
        form.setFirstName("John");
        form.setLastName("Doe");
        form.setEmail("john.doe@example.com");

        // Test getters
        assertEquals("John", form.getFirstName());
        assertEquals("Doe", form.getLastName());
        assertEquals("john.doe@example.com", form.getEmail());
    }

    @Test
    public void testToString() {
        // Create a Form object with some values
        Form form = new Form();
        form.setFirstName("John");
        form.setLastName("Doe");
        form.setEmail("john.doe@example.com");

        // Test the toString method
        String expectedString = "Form{id=null, firstName='John', middleName='null', lastName='Doe', dob='null', " +
                "maritalStatus='null', ssn='null', loanAmount='null', loanPurpose='null', " +
                "description='null', addressLine1='null', addressLine2='null', city='null', " +
                "state='null', postalCode='null', homePhone='null', officePhone='null', " +
                "mobileNumber='null', email='john.doe@example.com', employerName='null', " +
                "annualSalary='null', experienceYears='null', experienceMonths='null', " +
                "designation='null', employerAddressLine1='null', employerAddressLine2='null', " +
                "employerCity='null', employerState='null', employerPostalCode='null', status='null', " +
                "score=null, reason='null', date='null'}";

        assertEquals(expectedString, form.toString());
    }
}
