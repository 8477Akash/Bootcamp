package Java_8_1.Q4;

class A {
     String name;
     int age;
     public A(String name, int age) {
         this.name = name;
         this.age = age;
     }
    public void show(){
        System.out.println("name : " + name  + " age : " + age);
    }
}

@FunctionalInterface
interface ConstRefernce {
    A getA(String name, int age);
}

public class Q4 {
    public static void ConstructorRefernce() {

        ConstRefernce refernce = A::new;

        A a = refernce.getA("A", 18);
        a.show();

    }
}
