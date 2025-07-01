package Beyond_Java_8_1.Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Q4 {
    public static void main(String[] args) {
     List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).collect(Collectors.toUnmodifiableList());
     System.out.println("Immutable Copy of list : "+list);



    }
}
