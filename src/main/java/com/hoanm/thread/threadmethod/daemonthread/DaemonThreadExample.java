package com.hoanm.thread.threadmethod.daemonthread;

public class DaemonThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            System.out.println("Start thread: " + Thread.currentThread().getName());

            while (true) {
                System.out.println("Thread 1 working...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            System.out.println("Start thread: " + Thread.currentThread().getName());

            while (true) {
                System.out.println("Thread 2 working...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread 2");

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();


        Thread.sleep(1000);
        System.out.println("Finish main program.");
    }
}
