package com.example.demo;

import com.example.demo.bureauData.BureauData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BureauDataTests {

    @Test
    public void testGettersAndSetters() {
        // Create a BureauData object
        BureauData bureauData = new BureauData();

        // Set values using setters
        bureauData.setId(1);
        bureauData.setDelinq_2yrs(2);
        bureauData.setInq_last_6mths(3);

        // Test getters
        assertEquals(1, bureauData.getId());
        assertEquals(2, bureauData.getDelinq_2yrs());
        assertEquals(3, bureauData.getInq_last_6mths());
        // Add more assertions for other fields...
    }

    @Test
    public void testFullConstructor() {
        BureauData bureauData = new BureauData();
        bureauData.setId(1);
        bureauData.setDelinq_2yrs(2);
        bureauData.setInq_last_6mths(3);
        bureauData.setMths_since_last_delinq(4);
        bureauData.setMths_since_last_record(5);
        bureauData.setOpen_acc(6);
        bureauData.setPub_rec(7);
        bureauData.setRevol_bal(8);
        bureauData.setRevol_util(9.0f);
        bureauData.setTotal_acc(10);
        bureauData.setEarliest_cr_line("2023-01-01");

        assertEquals(1, bureauData.getId());
        assertEquals(2, bureauData.getDelinq_2yrs());
        assertEquals(3, bureauData.getInq_last_6mths());
        assertEquals(4, bureauData.getMths_since_last_delinq());
        assertEquals(5, bureauData.getMths_since_last_record());
        assertEquals(6, bureauData.getOpen_acc());
        assertEquals(7, bureauData.getPub_rec());
        assertEquals(8, bureauData.getRevol_bal());
        assertEquals(9.0f, bureauData.getRevol_util());
        assertEquals(10, bureauData.getTotal_acc());
        assertEquals("2023-01-01", bureauData.getEarliest_cr_line());
    }


    @Test
    public void testPartialConstructor() {
        BureauData bureauData = new BureauData(2, 3, 4, 5, 6, 7, 8, 9F, 10, "2023-01-01");
        assertNull(bureauData.getId()); // The id will be null in this constructor
        assertEquals(2, bureauData.getDelinq_2yrs());
        assertEquals(3, bureauData.getInq_last_6mths());
        assertEquals(4, bureauData.getMths_since_last_delinq());
        assertEquals(5, bureauData.getMths_since_last_record());
        assertEquals(6, bureauData.getOpen_acc());
        assertEquals(7, bureauData.getPub_rec());
        assertEquals(8, bureauData.getRevol_bal());
        assertEquals(9, bureauData.getRevol_util());
        assertEquals(10, bureauData.getTotal_acc());
        assertEquals("2023-01-01", bureauData.getEarliest_cr_line());
    }

}

