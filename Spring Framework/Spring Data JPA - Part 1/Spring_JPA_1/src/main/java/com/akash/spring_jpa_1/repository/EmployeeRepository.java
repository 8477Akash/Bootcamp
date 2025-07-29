package com.akash.spring_jpa_1.repository;

import com.akash.spring_jpa_1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

 List<Employee> findByName(String name);

 List<Employee> findByNameStartingWith(String prefix);

 List<Employee> findByAgeBetween(int startAge, int endAge);

}
