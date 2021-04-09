package com.hoanm.thread.threadmethod.yield;

public class MainYieldExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {

            System.out.println("Start thread: " + Thread.currentThread().getName());
            //this thread will yield for another threads start. priority
            Thread.yield();
            System.out.println("Well done thread: " + Thread.currentThread().getName());
        },"Thread 1");

        Thread thread2 = new Thread(() -> {
            System.out.println("Start thread: " + Thread.currentThread().getName());
            System.out.println("Well done thread: " + Thread.currentThread().getName());
        },"Thread 2");

        Thread thread3 = new Thread(() -> {
            System.out.println("Start thread: " + Thread.currentThread().getName());
            System.out.println("Well done thread: " + Thread.currentThread().getName());
        },"Thread 3");


//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService.execute(thread1);
//        executorService.execute(thread2);
//        executorService.execute(thread3);
//        executorService.shutdown();

        thread2.start();
        thread1.start();
        thread3.start();


    }
}


