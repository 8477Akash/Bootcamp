package Beyond_Java_8_1.Q1;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q1 {
    public static void main(String[] args) {


        System.out.println("\niterate() ");

        IntStream.iterate(0, i->i<10, i->i + 2).forEach(System.out::println);
    }
}
