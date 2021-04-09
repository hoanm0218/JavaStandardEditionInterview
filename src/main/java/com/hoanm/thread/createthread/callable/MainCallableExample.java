package com.hoanm.thread.createthread.callable;

import java.util.concurrent.*;

public class MainCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);


        Callable<Integer> callable1 = new CallableTask(1, "Callable 1");
        Callable<Integer> callable2 = new CallableTask(2, "Callable 2");
        Callable<Integer> callable3 = new CallableTask(3, "Callable 3");
        Callable<Integer> callable4 = new CallableTask(4, "Callable 4");

        /*
        Thread thread1 = new Thread(() -> {
            System.out.println("Processing thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish thread: " + Thread.currentThread().getName());
        });
        //Chúng ta có thể cash 1 runnable để submit mà return về 1 instance của Future
        Future<Integer> future1 = (Future<Integer>) executorService.submit(thread1);
        executorService.submit(callable1);
        executorService.submit(callable2);
        executorService.submit(callable3);
        executorService.submit(callable4);

        Thread.sleep(10000);
        System.out.println("Check thread 1 isDone: " + future1.isDone());
        executorService.shutdown();
        System.out.println("*************Finish program*************");

         */

        Future<Integer> future1 = executorService.submit(callable1);

        //Main thread process
        System.out.println("*************Check callable task 1 isDone: " + future1.isDone());
        System.out.println(future1.get()); //Ưu tiên thực hiện callable task được call operation get() để done
        System.out.println("*************Check callable task 1 isDone: " + future1.isDone());

        Future<Integer> future2 = executorService.submit(callable2);
        Future<Integer> future3 = executorService.submit(callable3);
        Future<Integer> future4 = executorService.submit(callable4);

        Thread.sleep(10000);
        executorService.shutdown();
        System.out.println("Callable task 1 return value: " + future1.get());
        System.out.println("Callable task 2 return value: " + future2.get());
        System.out.println("Callable task 3 return value: " + future3.get());
        System.out.println("Callable task 4 return value: " + future4.get());
        System.out.println("Last check terminated: " + executorService.isTerminated());
        System.out.println("*************Finish program*************");
    }
}

class CallableTask implements Callable<Integer> {

    private int num;
    private String name;

    public CallableTask(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable processing " + name);
        Thread.sleep(2000);
        num += num;
        System.out.println("Finish callable " + name);
        return num;
    }
}