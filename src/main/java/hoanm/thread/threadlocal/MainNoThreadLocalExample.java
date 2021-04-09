package hoanm.thread.threadlocal;

public class MainNoThreadLocalExample {
    public static void main(String[] args) throws InterruptedException {
        SimpleRunnable runnable = new SimpleRunnable();
        Thread thread1 = new Thread(runnable, "First Thread");
        Thread thread2 = new Thread(runnable, "Second Thread");
        Thread thread3 = new Thread(runnable, "Third Thread");

        thread1.start();
        thread1.join();
        System.out.println("Count= " + runnable.getCounter());
        thread2.start();
        thread2.join();
        System.out.println("Count= " + runnable.getCounter());
        thread3.start();
        thread3.join();

        //Result:
        //First Thread Count=5
        //Second Thread Count=10
    }

}

class SimpleRunnable implements Runnable{
    private Counter counter = new Counter();

    public int getCounter(){
        return counter.getCount();
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            counter.increment();
        }
        System.out.println(Thread.currentThread().getName()+ " Count=" + counter.getCount());
    }
}

class Counter{
    private int count = 0;

    public void increment(){
         count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
