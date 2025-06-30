package Beyond_Java_8_1.Q4;

import java.util.ArrayList;
import java.util.List;



public class Q4 {
    public static void main(String[] args) {
     List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

     List<Integer> list2 = List.copyOf(list);

     System.out.println("Immutable Copy of list : "+list2);


    }
}
