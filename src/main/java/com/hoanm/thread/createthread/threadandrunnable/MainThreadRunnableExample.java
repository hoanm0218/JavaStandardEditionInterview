package com.hoanm.thread.createthread.threadandrunnable;

public class MainThreadRunnableExample {
    public static void main(String[] args) {

        /**
         * Method 1
         */
        //Create thread object
        ThreadExtends threadExtends1 = new ThreadExtends();
        ThreadExtends threadExtends2 = new ThreadExtends();
        //Set name for each threads
        threadExtends1.setName("Thread extends: 1");
        threadExtends2.setName("Thread extends: 2");

        //Call operation start to run
        threadExtends1.start();
        threadExtends2.start();

        /**
         * Method 2
         */
        //Create thread object
        ThreadImplementsRunnable threadImplementsRunnable1 = new ThreadImplementsRunnable();
        ThreadImplementsRunnable threadImplementsRunnable2 = new ThreadImplementsRunnable();

        Thread threadImplements1 = new Thread(threadImplementsRunnable1);
        Thread threadImplements2 = new Thread(threadImplementsRunnable2);

        threadImplements1.setName("Thread implements: 1");
        threadImplements2.setName("Thread implements: 1");

        threadImplements1.start();
        threadImplements2.start();
    }
}

class ThreadExtends extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " run " + i);
        }
    }
}

class ThreadImplementsRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " run " + i);
        }
    }
}
