package hoanm.java8.streamapi.create;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFromArrayExample {
    public static void main(String[] args) {
        String[] languages = {"Java", "C#", "C++", "PHP", "Javascript"};
        // Get Stream using the Arrays.stream
        Arrays.stream(languages).forEach(System.out::println);
        // Get Stream using the Stream.of
        Stream.of(languages).forEach(System.out::println);
    }
}
