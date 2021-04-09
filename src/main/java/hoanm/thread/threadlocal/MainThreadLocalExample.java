package hoanm.thread.threadlocal;

public class MainThreadLocalExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalRunnable runnable = new ThreadLocalRunnable();
        Thread thread1 = new Thread(runnable, "First Thread");
        Thread thread2 = new Thread(runnable, "Second Thread");

        thread1.start();
        thread1.join();
        System.out.println("Count= " + runnable.getCounter());
        thread2.start();
        thread2.join();
        System.out.println("Count= " + runnable.getCounter());
        //Result:
        //First Thread Count=5
        //Second Thread Count=5
    }

}

class ThreadLocalRunnable implements Runnable{
    private ThreadLocal<ThreadLocalCounter> threadLocalCounter = ThreadLocal.withInitial(ThreadLocalCounter::new);

    public int getCounter(){
        return threadLocalCounter.get().getCount();
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            threadLocalCounter.get().increment();
        }
        System.out.println(Thread.currentThread().getName()+ " Count=" + threadLocalCounter.get().getCount());
    }
}

class ThreadLocalCounter{
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
