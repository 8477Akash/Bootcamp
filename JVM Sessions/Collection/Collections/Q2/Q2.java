package Collections.Q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    String name;
    double salary;
    double age;

    public Employee(String name, double salary, double age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);

    }
    @Override
    public String toString() {
        return "Name : "+ name +"\n" +
                "Salary : "+ salary+"\n"+
                "Age : "+ age + "\n";
    }
}
class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }


}
public class Q2 {
    public static void CompareEmp() {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Sahil", 13000.0, 23));
        list.add(new Employee("Akash", 15000.0, 23));
        list.add(new Employee("Aman", 14000.0, 23));


        System.out.println("Original list:");
        for (Employee e : list) {
            System.out.println(e);
        }


        Collections.sort(list);
        System.out.println("\n\n\nSorted by name (default Comparable):");
        for (Employee e : list) {
            System.out.println(e);
        }


        Collections.sort(list, new SalaryComparator());
        System.out.println("\n\n\nSorted by salary (custom Comparator):");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}