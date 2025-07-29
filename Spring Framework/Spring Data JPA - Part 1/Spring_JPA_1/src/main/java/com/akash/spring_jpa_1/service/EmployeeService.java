package com.akash.spring_jpa_1.service;

import com.akash.spring_jpa_1.model.Employee;
import com.akash.spring_jpa_1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(int id, Employee emp) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        employee.setLocation(emp.getLocation());
        return employeeRepository.save(employee);
    }

    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Employee with id: " + id + " has been deleted";
    }

    public Long countEmployee() {
        return employeeRepository.count();
    }

    public String createMultipleEmployees(List<Employee> emp) {
        employeeRepository.saveAll(emp);
        return "All Added";
    }

    public Page<Employee> pageEmployees(int page, int size) {
       Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC,"age");
       return employeeRepository.findAll(pageable);
    }
    public String deleteMultipleEmployees() {
        employeeRepository.deleteAll();
        return "All Deleted";
    }

    public List<Employee> findByName(String name){
        return employeeRepository.findByName(name);
    }

    public List<Employee> findByNameStartingWith(String name){
        return employeeRepository.findByNameStartingWith(name);
    }

    public List<Employee> findByAgeBetween(int startAge, int endAge){
        return employeeRepository.findByAgeBetween(startAge, endAge);
    }

}
