package com.akash.spring_jpa_2.service;

import com.akash.spring_jpa_2.dto.EmployeeDto;
import com.akash.spring_jpa_2.dto.EmployeeNativeDto;
import com.akash.spring_jpa_2.model.Employee;
import com.akash.spring_jpa_2.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

      public List<EmployeeDto> getEmployeeNames(){

         return employeeRepo.getEmployeeName();
      }
      public Employee createEmployee(Employee employee){
          return employeeRepo.save(employee);
      }
      public List<Employee> createAllEmployee(List<Employee> employees){
          return employeeRepo.saveAll(employees);
      }
      public String deleteAllEmployee(){
          employeeRepo.deleteAll();
          return "All employees have been deleted";
      }
      public List<Employee> getAllEmployee(){
          return employeeRepo.findAll();
      }

    public List<Employee> updateSalaryLessThanAverage(Double incrementAmount) {
        Double averageSalary = employeeRepo.findAverageSalary();
        List<Employee> employees = employeeRepo.findBySalaryLessThan(averageSalary);

        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + incrementAmount);
        }

        return employeeRepo.saveAll(employees);
    }

    @Transactional
    public String deleteEmployeeWithMinSalary() {
        Double minSalary = employeeRepo.findMinSalary();
        if (minSalary != null) {
            employeeRepo.deleteBySalaryEquals(minSalary);
            return "Employees with minimum salary (" + minSalary + ") have been deleted.";
        } else {
            return "No employees found.";
        }

    }

    public List<EmployeeNativeDto> getEmployeeFromLastName(){
        List<Object[]> obj= employeeRepo.getEmployeebyName();
        return obj.stream()
                .map(o-> new EmployeeNativeDto(
                        ((String) o[0]),
                        ((Number) o[1]).intValue(),
                        ((Number) o[2]).longValue()
                )).toList();
    }

    @Transactional
    public String deleteEmployeeWithAge(Integer age) {
          employeeRepo.deleteEmployeeByAge(age);
          return "All Employee with age " + age + " has been deleted.";
    }

}
