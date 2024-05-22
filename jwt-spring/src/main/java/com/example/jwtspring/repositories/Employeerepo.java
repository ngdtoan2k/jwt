package com.example.jwtspring.repositories;

import com.example.jwtspring.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Employeerepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
