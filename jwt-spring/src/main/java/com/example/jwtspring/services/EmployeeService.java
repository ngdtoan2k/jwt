package com.example.jwtspring.services;

import com.example.jwtspring.entities.Employee;
import com.example.jwtspring.repositories.Employeerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private final Employeerepo employeerepo;
    @Autowired
    public EmployeeService(Employeerepo employeerepo) {
        this.employeerepo = employeerepo;
    }
    public Employee addEmpolyee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeerepo.save(employee);
    }
    public List<Employee> findAllemployees(){
        return employeerepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeerepo.save(employee);
    }
    public Employee findEmployeeById(Long id){
        return employeerepo.findEmployeeById(id);
    }
    public void deleteEmployee(Long id){
        employeerepo.deleteEmployeeById(id);
    }


}
