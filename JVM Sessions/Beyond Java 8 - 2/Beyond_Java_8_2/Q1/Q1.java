package Beyond_Java_8_2.Q1;

record Student (String id, String name, String standard) {
}

public class Q1 {
    public static void main(String[] args) {
        Student obj = new Student("1", "Akash","10th");
        Student obj2 = new Student("2", "Sahil","10th");


        System.out.println(obj);
        System.out.println(obj2);
    }
}
