package com.hoanm.thread.threadmethod.priority;

public class MainPriorityThreadExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new PriorityThread(),"Thread 1");
        Thread thread2 = new Thread(new PriorityThread(),"Thread 2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}

class PriorityThread extends Thread{
    @Override
    public void run() {
        System.out.println("Start thread: " + Thread.currentThread().getName());
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
        for (int i = 0; i < 10000; i++){
            System.out.println(i);
        }
        System.out.println("Well done thread: " + Thread.currentThread().getName() + "\n");
    }
}