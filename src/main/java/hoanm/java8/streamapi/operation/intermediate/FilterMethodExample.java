package hoanm.java8.streamapi.operation.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterMethodExample {
    // filter() operation helps eliminate elements based on certain criteria
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data.stream().filter(s -> !s.equals("Java"))
                .forEach(System.out::println);
    }
}
