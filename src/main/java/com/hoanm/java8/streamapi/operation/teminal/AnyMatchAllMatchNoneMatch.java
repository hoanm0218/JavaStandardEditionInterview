package com.hoanm.java8.streamapi.operation.teminal;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchNoneMatch {

    public static void main(String[] args) {
        // match() operation returns a boolean depending upon the condition applied on stream data
        List<String> data = Arrays.asList("Javascript", "Java", "C#", "PHP", "C++");
        boolean resultAnyMatch = data.stream().anyMatch(s -> s.equalsIgnoreCase("Java"));
        System.out.println("Any match with Java: " + resultAnyMatch);

        boolean resultAllMatch = data.stream().allMatch(s -> s.equalsIgnoreCase("Java"));
        System.out.println("All match with Java: " + resultAllMatch);

        boolean resultNoneMatch = data.stream().noneMatch(s -> s.equalsIgnoreCase("Java"));
        System.out.println("None match with Java: " + resultAllMatch);
    }
}
