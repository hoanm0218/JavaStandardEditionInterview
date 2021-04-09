package hoanm.thread.threadmethod.priority;

public class MainPriorityExample2 extends Thread{
    public void run() {
        System.out.println("running thread name is: " + Thread.currentThread().getName());
        System.out.println("running thread priority is: " + Thread.currentThread().getPriority());
        System.out.println("Well done thread: " + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        MainPriorityExample2 m1 = new MainPriorityExample2();
        m1.setName("Thread 1");

        MainPriorityExample2 m2 = new MainPriorityExample2();
        m2.setName("Thread 2");

        m2.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
