package Java_8_2.Q5;
import java.util.*;
import java.util.stream.*;


class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ravi Kumar Singh", 4000L, "delhi"),
                new Employee("Anita Sharma", 6000L, "mumbai"),
                new Employee("Ravi Raj", 4500L, "delhi"),
                new Employee("Seema Verma", 3000L, "delhi")
        );

        List<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && "delhi".equalsIgnoreCase(e.city))
                .map(Employee::getFirstName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Filtered First Names: " + uniqueFirstNames);
    }
}



