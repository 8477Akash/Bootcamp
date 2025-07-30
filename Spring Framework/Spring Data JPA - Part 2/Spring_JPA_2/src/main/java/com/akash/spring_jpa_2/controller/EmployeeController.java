package com.akash.spring_jpa_2.controller;

import com.akash.spring_jpa_2.dto.EmployeeDto;
import com.akash.spring_jpa_2.dto.EmployeeNativeDto;
import com.akash.spring_jpa_2.model.Employee;
import com.akash.spring_jpa_2.service.EmployeeService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/native/get")
    public List<EmployeeNativeDto> getEmployeesNative(){
        return employeeService.getEmployeeFromLastName();
    }

    @GetMapping("/getName")
    public List<EmployeeDto> getAllEmployeesName(){
        return employeeService.getEmployeeNames();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @PostMapping("/createall")
    public List<Employee> createAllEmployee(@RequestBody List<Employee> employees) {
        return employeeService.createAllEmployee(employees);
    }
    @PutMapping("/update-salary")
    public List<Employee> updateSalaries(@RequestParam Double increment) {
        return employeeService.updateSalaryLessThanAverage(increment);
    }
    @DeleteMapping
    public String deleteAllEmployee(){
        return employeeService.deleteAllEmployee();
    }
    @DeleteMapping("/minsalary")
    public String deleteEmployeeByMinSalary() {
        return employeeService.deleteEmployeeWithMinSalary();
    }

    @DeleteMapping("/native/delete")
    public String deleteEmployeeNative(@RequestParam Integer age) {
        return employeeService.deleteEmployeeWithAge(age);
    }
}
