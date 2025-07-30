package com.akash.spring_jpa_2.dto;

public class EmployeeNativeDto {
    private String firstName;
    private Integer age;
    private Long id;

    public EmployeeNativeDto(String firstName, Integer age, Long id) {
        this.firstName = firstName;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", id=" + id ;
    }
}
