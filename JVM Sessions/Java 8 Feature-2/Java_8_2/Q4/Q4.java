package Java_8_2.Q4;

import java.util.Optional;

public class Q4 {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        System.out.println("Is name present? " + name.isPresent());

        String value = name.orElse("Default Name");
        System.out.println("Value: " + value);

        name.ifPresent(n -> System.out.println("Uppercase: " + n.toUpperCase()));
    }
}
