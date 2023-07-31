package com.example.demo;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.form.Form;
import com.example.demo.repo.FormDataRepo;
import com.example.demo.repo.BureauDataRepo;
import com.example.demo.service.FormService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FormServiceTests {

    @Mock
    private FormDataRepo formDataRepo;

    @Mock
    private BureauDataRepo bureauDataRepo;

    @InjectMocks
    private FormService formService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAllForms() {
        // Mock the behavior of the formDataRepo
        List<Form> forms = new ArrayList<>();
        forms.add(new Form(1L, "John", "Doe", "2023-07-27"));
        forms.add(new Form(2L, "Jane", "Smith", "2023-07-26"));
        when(formDataRepo.findAll()).thenReturn(forms);

        // Call the service method
        List<Form> result = formService.findAllForms();

        // Verify the result
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(forms, result);
    }

    @Test
    public void testUpdateForm() {
        // Mock the behavior of the formDataRepo
        Form form = new Form(1L, "John", "Doe", "2023-07-27");
        when(formDataRepo.save(form)).thenReturn(form);

        // Call the service method
        Form result = formService.updateForm(form);

        // Verify the result
        assertNotNull(result);
        assertEquals(form, result);
        verify(formDataRepo, times(1)).save(form);
    }

    @Test
    public void testFindFormById() {
        // Mock the behavior of the formDataRepo
        Form form = new Form(1L, "John", "Doe", "2023-07-27");
        when(formDataRepo.findFormById(1L)).thenReturn(Optional.of(form));

        // Call the service method
        Form result = formService.findFormById(1L);

        // Verify the result
        assertNotNull(result);
        assertEquals(form, result);
    }

    @Test
    public void testFindFormById_UserNotFoundException() {
        // Mock the behavior of the formDataRepo to return an empty Optional
        when(formDataRepo.findFormById(1L)).thenReturn(Optional.empty());

        // Call the service method and expect an exception
        assertThrows(UserNotFoundException.class, () -> formService.findFormById(1L));
    }

    @Test
    public void testDeleteForm() {
        // Call the service method
        formService.deleteForm(1L);

        // Verify that the formDataRepo.deleteFormById() method is called once
        verify(formDataRepo, times(1)).deleteFormById(1L);
    }
}