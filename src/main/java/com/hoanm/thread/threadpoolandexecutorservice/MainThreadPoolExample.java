package com.hoanm.thread.threadpoolandexecutorservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainThreadPoolExample {

    public static void main(String[] args) {
        //1 mảng QueueCustom để chứa các nhiệm vụ chưa được xử lý
        ArrayBlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(100);

        //Tạo ra 1 ThreadPool để cho phép xử lý số lượng Thread đồng thời
        /**
         * Trong đó:
         *          - corePoolSize: là tối thiểu Thread trong ThreadPool
         *          - maximumPoolSize: là tối đa Thread trong ThreadPool
         *          - keepAliveTime: là thời gian tối đa mà 1 Thread nhàn rỗi chờ nhiệm vụ. khi hết thời gian chờ mà
         *            không có nhiệm vụ thì nó sẽ bị hủy.
         *          - unit: là đơn vị thời gian của keepAliveTime
         *          - workQueue: là nơi chứa các nhiệm vụ mà Thread sẽ lấy chúng và thực thi lần lượt
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 1, TimeUnit.SECONDS, blockingQueue);

        // dùng vòng lặp for để có thể chạy các Thread
        for (int i = 1; i <= 10; i++) {
            // trong phương thức execute() thì đối số truyền vào phải là một Runnable
            // đó là lý do mà lớp ThreadPool phải implements từ interface Runnable or extends class Thread
            threadPoolExecutor.execute(new ThreadTask(i));
        }
        threadPoolExecutor.shutdown();


    }
}

class ThreadTask implements Runnable {
    int id;

    public ThreadTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Đang xử lý tiến trình " + id);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Đã xử lý xong tiến trình " + id);
    }
}