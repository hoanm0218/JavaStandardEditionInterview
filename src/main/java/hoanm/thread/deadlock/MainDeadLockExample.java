package hoanm.thread.deadlock;

public class MainDeadLockExample {
    public static void main(String[] args) throws InterruptedException {
        Object object1 = new String("Object1");
        Object object2 = new String("Object2");

        Thread t1 = new Thread(new DeadlockThread(object1, object2), "Thread1");
        Thread t2 = new Thread(new DeadlockThread(object2, object1), "Thread2");

        t1.start();
        Thread.sleep(1000);

        t2.start();
        Thread.sleep(1000);

    }
}
