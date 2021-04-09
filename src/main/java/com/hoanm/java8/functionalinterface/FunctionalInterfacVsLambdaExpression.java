package com.hoanm.java8.functionalinterface;

public class FunctionalInterfacVsLambdaExpression {
    public static void main(String[] args) {
        int count1 = 10;
        IRun dogRun = () -> System.out.println("Dog running...");
        dogRun.run();
        ICounter dogCount = (count) -> {
            System.out.println("Result of counter: " + count);
            System.out.println("Dog counted");
            count--;
            return count;
        };
        System.out.println("Result after Dog count: " + dogCount.count(count1));

    }
}

@FunctionalInterface
interface IRun {
    void run();
}

@FunctionalInterface
interface ICounter {
    int count(int count);
}
