package hoanm.java8.streamapi.create;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamFromPrimitiveExample {
    public static void main(String[] args) {
        System.out.println("IntStream: ");
        IntStream.of(1, 2, 3).forEach(System.out::println);

        System.out.println("LongStream: ");
        LongStream.of(1, 2, 3).forEach(System.out::println);

        System.out.println("DoubleStream: ");
        DoubleStream.of(1, 2, 3).forEach(System.out::println);
    }
}
