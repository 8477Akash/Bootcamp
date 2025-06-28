package Java_8_2.Q1;
import java.util.function.*;

public class Q1 {


        public static void main(String[] args) {
            Consumer<String> consumer = s -> System.out.println("Consumed: " + s);
            consumer.accept("Java 8");

            System.out.println("\n\n");

            Supplier<String> supplier = () -> "Supplied value";
            System.out.println(supplier.get());

            System.out.println("\n\n");

            Predicate<Integer> predicate = n -> n > 10;
            System.out.println("Is 15 > 10? " + predicate.test(15));

            System.out.println("\n\n");

            Function<String, Integer> function = String::length;
            System.out.println("Length of 'Lambda': " + function.apply("Lambda"));
        }
    }

