package com.akash.spring_jpa_2.repository;

import com.akash.spring_jpa_2.dto.EmployeeDto;
import com.akash.spring_jpa_2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("select new com.akash.spring_jpa_2.dto.EmployeeDto(e.firstName,e.lastName) from Employee e " +
            "where e.salary > (select avg(e1.salary) from Employee e1)" +
            "order by e.age asc , e.salary desc")
    List<EmployeeDto> getEmployeeName();

    @Query("select avg(e1.salary) from Employee e1")
    Double findAverageSalary();
    List<Employee> findBySalaryLessThan(Double salary);

    @Query("select min(e.salary) from Employee e")
    Double findMinSalary();

    void deleteBySalaryEquals(Double salary);

    @Query(value="select emp_id,emp_first_name,emp_age from employee_table where emp_last_name LIKE '%singh'",nativeQuery = true)
    List<Object[]> getEmployeebyName();

    @Modifying
    @Query(value = "delete from employee_table where emp_age >:age",nativeQuery = true)
    void deleteEmployeeByAge(@Param("age") Integer age);

}
