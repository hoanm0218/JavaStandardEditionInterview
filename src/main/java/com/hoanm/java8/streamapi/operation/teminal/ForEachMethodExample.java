package com.hoanm.java8.streamapi.operation.teminal;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodExample {

    public static void main(String[] args) {
        // foreach operations helps iterate the elements of the Stream
        List<String> data = Arrays.asList("Javascript", "Java", "C#", "PHP", "C++");
        data.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
