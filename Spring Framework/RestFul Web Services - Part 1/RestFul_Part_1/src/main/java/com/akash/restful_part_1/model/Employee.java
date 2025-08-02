package com.akash.restful_part_1.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 18, message = "Age must be >= 18")
    private int age;

    public Employee() {}

    public Employee(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
