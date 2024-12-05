import java.util.*;
import java.util.stream.*;
import java.util.Optional;

public class Java8Demo {
    public static void main(String[] args) {
        Optional<String> str = Optional.ofNullable("Hello, Java 8!");
        str.ifPresent(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                          .mapToInt(Integer::intValue)
                          .sum();
        System.out.println("Sum: " + sum);
    }
}
