package com.hoanm.java8.streamapi.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamFromCollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Generate Streams using .stream() or parallelStream()
        list.stream().forEach(System.out::println);
        list.parallelStream().forEach(System.out::println);

        // Generate Streams using Stream.generate()
        Stream<String> stream = Stream.generate(() -> "UniDev").limit(3);
        String[] testStrArr = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(testStrArr));

        // Generate Streams using Stream.iterate()
        Stream<Long> iterateNumbers = Stream.iterate(1L, n -> n + 1).limit(5);
        iterateNumbers.forEach(System.out::print); // 12345

        // Generate Streams from APIs like Regex
        System.out.println();
        String str = "Hi all! ,I'm ,UniDev";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);

    }
}
