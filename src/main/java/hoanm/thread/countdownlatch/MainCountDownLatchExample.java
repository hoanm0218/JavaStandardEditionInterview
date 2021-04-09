package hoanm.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MainCountDownLatchExample {
    public static void main(String[] args) {
        MainCountDownLatchExample demo = new MainCountDownLatchExample();
        demo.counter();
        //Result: Count = 0
    }

    public CountDownLatch count = new CountDownLatch(2000);

    public void counter() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.countDown();  // giảm giá trị của biến count
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.countDown();
            }
        });

        thread1.start();
        thread2.start();

        try {
            count.await(); // Giống như join() trong Thread
        } catch (InterruptedException ignored) {

        }
        System.out.println("Count = " + count.getCount());
    }
}
