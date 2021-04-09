package com.hoanm.thread.countdownlatch;

public class MainNonCountDownLatchExample {
    public static void main(String[] args) {
        MainNonCountDownLatchExample demoNonCountDownLatch = new MainNonCountDownLatchExample();
        demoNonCountDownLatch.counter();
        //Result: Count = ... Vì 2 luồng thay đổi k đồng bộ nên giá trị k như mong muốn
    }

    private int count = 2000;
    public void counter() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count--;
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count--;
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ignored) {
        }

        System.out.println("Count = " + count);
    }
}
