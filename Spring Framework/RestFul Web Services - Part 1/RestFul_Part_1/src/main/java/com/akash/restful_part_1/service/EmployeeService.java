package com.akash.restful_part_1.service;

import com.akash.restful_part_1.exception.ResourceNotFoundException;
import com.akash.restful_part_1.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {

    private Map<Long, Employee> employees = new HashMap<>();
    private long customId = 1L;

    private synchronized Long generateCustomId() {
        return customId++;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public Employee getEmployeeById(Long id) {
        Employee emp = employees.get(id);
        if (emp == null) throw new ResourceNotFoundException("Employee not found with id: " + id);
        return emp;
    }

    public Employee createEmployee(Employee employee) {
        employee.setId(generateCustomId());
        employees.put(employee.getId(), employee);
        return employee;
    }

    public void deleteEmployee(Long id) {
        if (!employees.containsKey(id)) throw new ResourceNotFoundException("Employee not found with id: " + id);
        employees.remove(id);
    }

    public Employee updateEmployee(Long id, Employee updated) {
        if (!employees.containsKey(id)) throw new ResourceNotFoundException("Employee not found with id: " + id);
        updated.setId(id);
        employees.put(id, updated);
        return updated;
    }
}