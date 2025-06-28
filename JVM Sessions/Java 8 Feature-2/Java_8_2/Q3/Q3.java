package Java_8_2.Q3;
import java.util.Arrays;
import java.util.List;

public class Q3 {


        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 4, 6, 8, 3, 9);

            System.out.println("Number of elements in list: ");

            for (Integer number : numbers) {
                System.out.print(number+"\t");
            }

            System.out.println("\n\n");
            int sum = numbers.stream()
                    .filter(n -> n > 5)
                    .mapToInt(Integer::intValue)
                    .sum();

            System.out.println("Sum of numbers > 5: " + sum);
        }
    }

