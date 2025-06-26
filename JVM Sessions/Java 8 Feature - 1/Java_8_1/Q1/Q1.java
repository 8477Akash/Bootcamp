package Java_8_1.Q1;

@FunctionalInterface
interface Greater {
    boolean greater(int a, int b);
}

@FunctionalInterface
interface Increase {
    int increase(int a);
}

@FunctionalInterface
interface Concatinate {
    String concatinate(String a, String b);
}
@FunctionalInterface
interface UpperCase {
    String upperCase(String s);
}

public class Q1 {
    public static void Implement() {
        Greater g = (a,b) ->  a > b;


        if(g.greater(10,1)){
            System.out.println("A is greater than B");
        } else  {
            System.out.println("B is greater than A");
        }

        System.out.println("\n\n");

        Increase i = (a) -> a++;
        System.out.println("Value Incremented by 1 : "+ i.increase(10));

        System.out.println("\n\n");

        Concatinate c = (a, b) -> a + b;
        System.out.println("Concatinated Strings : " + c.concatinate("a","b"));

        System.out.println("\n\n");

        UpperCase u = (s) -> s.toUpperCase();
        System.out.println("UpperCase : " +u.upperCase("akash"));

    }
}
