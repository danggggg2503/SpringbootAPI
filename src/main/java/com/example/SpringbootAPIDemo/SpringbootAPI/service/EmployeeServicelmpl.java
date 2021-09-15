package com.example.SpringbootAPIDemo.SpringbootAPI.service;

import com.example.SpringbootAPIDemo.SpringbootAPI.entity.Employee;
import com.example.SpringbootAPIDemo.SpringbootAPI.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicelmpl implements EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateById(Employee employee) {
        employeeRepository.save(employee);
    }
}
