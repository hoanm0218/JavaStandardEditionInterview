package com.hoanm.java8.streamapi.operation.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SkipLimitMethodExample {

    // limit() Returns a stream consisting of the elements of this stream, truncated
    // to be no longer than maxSize in length.
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(num -> num > 5)
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data.stream()
                .filter(s -> !s.equals("Java"))
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}
