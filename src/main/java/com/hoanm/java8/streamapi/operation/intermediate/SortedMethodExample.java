package com.hoanm.java8.streamapi.operation.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedMethodExample {

    public static void main(String[] args) {
        // sorted() operation helps sort elements based on certain criteria
        Stream.of(1, 5, 10, 7, 2, 6, 3, 7, 4, 9)
                .filter(num -> num > 2)
                .sorted() // sorted according to natural order
                .forEach((s)->System.out.print(s));

        List<String> data = Arrays.asList("Javascript", "Java", "C#", "PHP", "C++");
        data.stream()
                .filter(s -> !s.equals("Java"))
                .map(String::toUpperCase)
                .sorted((s1,s2) -> s1.length() - s2.length()) // sorted according to the provided Comparator
                .forEach(System.out::println);
    }
}
