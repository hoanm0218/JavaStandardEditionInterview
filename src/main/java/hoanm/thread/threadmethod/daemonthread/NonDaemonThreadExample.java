package hoanm.thread.threadmethod.daemonthread;

public class NonDaemonThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            System.out.println("Start thread: " + Thread.currentThread().getName());

            while (true){
                System.out.println("Thread 1 working...");
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread 1");

        thread1.start();

        Thread.sleep(1000);
        System.out.println("Finish main program.");
    }
}
