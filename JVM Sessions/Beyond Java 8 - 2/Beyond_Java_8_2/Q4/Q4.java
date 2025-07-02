package Beyond_Java_8_2.Q4;

sealed class A permits B,C,D{
    void show(){
        System.out.println("A");
    }
}

final class B extends A{
    @Override
    void show(){
        System.out.println("B");
    }
}

sealed class C extends A permits E{
    @Override
    void show(){
        System.out.println("C");
    }
}

non-sealed class D extends A{
    @Override
    void show(){
        System.out.println("D");
    }
}
final class E extends C{
    @Override
    void show(){
        System.out.println("E");
    }
}

public class Q4 {
    public static void main(String[] args) {
        A obj;

        obj = new B();
        obj.show(); // Output: B

        obj = new C();
        obj.show(); // Output: C

        obj = new D();
        obj.show(); // Output: D

        obj = new E();
        obj.show(); // Output: E
    }
}
