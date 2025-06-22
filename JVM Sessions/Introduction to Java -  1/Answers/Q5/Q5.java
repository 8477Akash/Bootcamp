package Module_1;

class Employee {
private String firstName;
private String lastName;
private int age;
private String designation;

// Default constructor
public Employee() {
    this.firstName = "Unknown";
    this.lastName = "Unknown";
    this.age = 0;
    this.designation = "Unknown";
}

// Parameterized constructor
public Employee(String firstName, String lastName, int age, String designation) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.designation = designation;
}

// Copy constructor
public Employee(Employee other) {
    this.firstName = other.firstName;
    this.lastName = other.lastName;
    this.age = other.age;
    this.designation = other.designation;
}


public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public void setAge(int age) {
    this.age = age;
}

public void setDesignation(String designation) {
    this.designation = designation;
}

@Override
public String toString() {
    return "Employee Details:\n" +
            "Full Name: " + firstName + " " + lastName + "\n" +
            "Age: " + age + "\n" +
            "Designation: " + designation;
}
}
public class Q5 {
    public static void EmployeeMethods() {
        Employee emp = new Employee();
        emp.setFirstName("Akash");
        emp.setLastName("Kumar");
        emp.setAge(23);
        emp.setDesignation("Trainee");

        System.out.println(emp);

    }
}