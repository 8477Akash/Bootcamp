package Beyond_Java_8_1.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Integer, String> map = Map.of(1, "Hello", 2, "World");

        System.out.println("List is : "+list);
        System.out.println("Set is : "+set);
        System.out.println("Map is : "+map);
    }
}
