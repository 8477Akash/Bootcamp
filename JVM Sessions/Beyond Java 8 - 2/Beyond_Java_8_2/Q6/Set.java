package Beyond_Java_8_2.Q6;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class Set {

    public static void set(){
        SequencedSet<String> set = new LinkedHashSet<>();
        set.add("B");
        set.add("C");
        set.addFirst("A");
        set.addLast("D");

        System.out.println("Set: " + set);

        System.out.println("First: " + set.getFirst());
        System.out.println("Last: " + set.getLast());

        set.removeFirst();
        set.removeLast();

        System.out.println("After removeFirst & removeLast: " + set);

        SequencedSet<String> reversedSet = set.reversed();
        System.out.println("Reversed Set: " + reversedSet);

    }
}
