package Java_8_1.Q3;

interface Parent{
    default void show(){
        System.out.println("Parent");
    }
}
interface Child1 extends Parent{
    default void show(){
        System.out.println("Child1");
    }
}
interface Child2 extends Parent{
    default void show(){
        System.out.println("Child2");
    }
}

public class Q3 implements Child1, Child2 {
    @Override
    public void show() {
        System.out.println("Child of child");
    }

    public static void MultupleInheritance() {
        Q3 q = new Q3();
        q.show();
    }
}
