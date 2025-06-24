package Module_2.Q5;

public class Q5 {
    public static void Singleton() {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();

        c1.increment();
        c1.increment();

        c2.increment();

        System.out.println("Count from c1: " + c1.getCount());
        System.out.println("Count from c2: " + c2.getCount());

        if (c1 == c2) {
            System.out.println("c1 and c2 are the same instance (Singleton).");
        }
    }

}