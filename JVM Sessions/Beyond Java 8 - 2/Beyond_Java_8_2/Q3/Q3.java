package Beyond_Java_8_2.Q3;


import java.util.Objects;

record Student (String id, String name, String standard) {
    public Student(String id, String name, String standard) {
        this.id = Objects.requireNonNull(id, "id should not be null");
        this.name = Objects.requireNonNull(name, "Name cannot be Null");
        this.standard = Objects.requireNonNull(standard, "Standard cannot be Null");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Student obj = new Student("1", "Akash","10th");
        Student obj2 = new Student("2", "Sahil","10th");
        System.out.println(obj);
        System.out.println(obj2);

        System.out.println("Equals : "+obj.equals(obj2));
        System.out.println("HashCode : "+obj.hashCode());
    }
}
