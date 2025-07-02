package Beyond_Java_8_2.Q5;

sealed class A permits B, C, D {
    void show(){
        System.out.println("A");
    }
}

final class B extends A {
    @Override
    void show(){
        System.out.println("B");
    }
}

sealed class C extends A permits E {
    @Override
    void show(){
        System.out.println("C");
    }
}

non-sealed class D extends A {
    @Override
    void show(){
        System.out.println("D");
    }
}
final class E extends C {
    @Override
    void show(){
        System.out.println("E");
    }
}

/*
Sealed class A ---
                 permits 3 classes ---
                                     B , C , D
                                     now B , C ,D can be final sealed non-sealed

                 // B is Final hence cannot be extended by other classes;
                 // C is sealed and permits E
                 // D is non-sealed , hence can be accessed by other classes(extended by other classes)


                                   // E is Final class which extends C


                  // It is mandatory to extend the class which permits to extend - A should be extended by all B  C  D
                  //

*/

public class Q5 {
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
