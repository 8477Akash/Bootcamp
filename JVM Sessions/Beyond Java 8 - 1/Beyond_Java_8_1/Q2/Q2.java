package Beyond_Java_8_1.Q2;

import java.util.Optional;

public class Q2 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");

        optional.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
