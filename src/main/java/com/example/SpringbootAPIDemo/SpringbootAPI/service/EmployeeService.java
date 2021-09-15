package com.example.SpringbootAPIDemo.SpringbootAPI.service;

import com.example.SpringbootAPIDemo.SpringbootAPI.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmployee(long id);

    void createEmployee(Employee employee);

    void deleteById(long id);

    void updateById(Employee employee);
}
