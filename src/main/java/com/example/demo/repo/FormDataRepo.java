package com.example.demo.repo;

import com.example.demo.form.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface FormDataRepo extends JpaRepository<Form, Long> {
    void deleteFormById(Long id);
    Optional<Form> findFormById(Long id);
}
