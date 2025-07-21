package com.akash.springboot.config;

import com.akash.springboot.model.Employee;
import com.akash.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository repository;

    public DataInitializer(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Employee(null, "Alice", "Developer"));
        repository.save(new Employee(null, "Bob", "Tester"));
        repository.save(new Employee(null, "Charlie", "Manager"));
        System.out.println("Sample employees added to H2 database.");
    }
}
