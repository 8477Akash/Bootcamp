package Beyond_Java_8_2.Q2;

import java.util.Objects;

record Student (String id, String name, String standard) {
    public Student(String id, String name, String standard) {
        this.id = Objects.requireNonNull(id, "id should not be null");
        this.name = Objects.requireNonNull(name, "Name cannot be Null");
        this.standard = Objects.requireNonNull(standard, "Standard cannot be Null");
    }
}
public class Q2 {

public static void main(String[] args) {
    Student obj = new Student("1", "Akash","10th");
    try{
        Student obj2 = new Student("2", null,"10th");
    }catch (Exception e){
        System.out.println("Error : "+e.getMessage());
    }

    System.out.println(obj);

}
}

