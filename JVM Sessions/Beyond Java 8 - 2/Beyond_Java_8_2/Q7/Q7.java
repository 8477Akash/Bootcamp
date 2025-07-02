package Beyond_Java_8_2.Q7;

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();

        map.put("B", 2);
        map.putLast("C", 3);
        map.putFirst("A", 1);
        map.putLast("D", 4);

        System.out.println("Map: " + map);


        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());


        map.pollFirstEntry();
        map.pollLastEntry();

        System.out.println("After polling first and last: " + map);


        SequencedMap<String, Integer> reversed = map.reversed();
        System.out.println("Reversed map: " + reversed);

    }
}
