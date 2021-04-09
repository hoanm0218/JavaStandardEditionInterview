package hoanm.java8.streamapi.operation.teminal;

import java.util.stream.IntStream;

public class ReduceMethodExample {

    // reduce() operation combines the stream elements into one using a BinaryOperator
    public static void main(String[] args) {

        int result = IntStream.of(1, 2, 3, 4, 5).reduce(0, ReduceMethodExample::sum);
        System.out.println(result); // 10
    }

    static int sum(int a, int b){
        return a+b;
    }
}
