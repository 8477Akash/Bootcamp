package Collections.Q4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    String name;
    int age;
    String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (( o instanceof Employee) == false) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    @Override
    public String toString() {
        return name;
    }
}

public class Q4 {

    public static void MapEmployee() {

        Employee emp = new Employee("Sahil", 23, "JVM Trainee");
        Employee emp2 = new Employee("Aman", 23, "JVM Trainee");
        Employee emp3 = new Employee("Manish", 23, "React Trainee");

        System.out.println("Current Employee Name : " );
        System.out.println(emp);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println("\n\n");

        Map<Employee, Double> map = new HashMap<>();
        map.put(emp, 10000.0);
        map.put(emp2, 20000.0);
        map.put(emp3, 30000.0);

        for(Map.Entry<Employee, Double> entry : map.entrySet()) {
            System.out.println("Salary of "+entry.getKey() + " is : " + entry.getValue());
        }

    }

}
