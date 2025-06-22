// ClassNotFoundDemo.java
public class ClassNotFoundDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.fake.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}

