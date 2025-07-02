package Beyond_Java_8_2.Q6;

import java.util.*;

public class List {

    public static void list() {
        SequencedCollection<String> list = new LinkedList<>();

        list.addFirst("B");
        list.addLast("C");
        list.addFirst("A");
        list.addLast("D");

        System.out.println("List: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.removeFirst(); 
        list.removeLast();  

        System.out.println("After removeFirst & removeLast: " + list);

        SequencedCollection<String> reversedList = list.reversed();
        System.out.println("Reversed List: " + reversedList);
    }
}
