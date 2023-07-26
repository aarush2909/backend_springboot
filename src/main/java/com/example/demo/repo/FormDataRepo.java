package com.example.demo.repo;

import com.example.demo.form.Form;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FormDataRepo extends JpaRepository<Form, Long> {
    void deleteFormById(Long id);
    Optional<Form> findFormById(Long id);
}
