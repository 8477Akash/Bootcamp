package com.akash.spring_jpa_1.controller;

import com.akash.spring_jpa_1.model.Employee;
import com.akash.spring_jpa_1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/count")
    public long countEmployees() {
        return employeeService.countEmployee();
    }
    @GetMapping("/name")
    public List<Employee> findByName(@RequestParam String name) {
     return employeeService.findByName(name);
    }
    @GetMapping("/name/prefix")
    public List<Employee> findByNamePrefix(@RequestParam String prefix) {
        return  employeeService.findByNameStartingWith(prefix);
    }
    @GetMapping("/age")
    public List<Employee> findByAge(@RequestParam int minAge, @RequestParam int maxAge) {
        return employeeService.findByAgeBetween(minAge, maxAge);
    }

    @GetMapping("/pages")
    public Page<Employee> pageEmployees(@RequestParam int page,@RequestParam int size) {
        return employeeService.pageEmployees(page, size);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee emp){
        return employeeService.createEmployee(emp);
    }

    @PostMapping("/multiple")
    public String createMultipleEmployees(@RequestBody List<Employee> emp){
        return employeeService.createMultipleEmployees(emp);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee emp){
        return employeeService.updateEmployee(id,emp);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }
    @DeleteMapping("/deleteAll")
    public String delete() {
        return employeeService.deleteMultipleEmployees();
    }
}
