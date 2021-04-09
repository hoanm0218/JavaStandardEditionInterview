package com.hoanm.thread.threadpoolandexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainExecutorService {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(new ExecutorTask(1));
        Thread thread2 = new Thread(new ExecutorTask(2));
        Thread thread3 = new Thread(new ExecutorTask(3));
        Thread thread4 = new Thread(new ExecutorTask(4));
        Thread thread5 = new Thread(new ExecutorTask(5));

        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.submit(thread4);
        executorService.submit(thread5);

        executorService.shutdown();
    }
}

class ExecutorTask implements Runnable {
    int id;

    public ExecutorTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Đang xử lý tiến trình " + id);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Đã xử lý xong tiến trình " + id);
    }
}
