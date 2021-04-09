package hoanm.thread.threadmethod.join;

public class MainJoinExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new JoinThread(),"Thread 1");
        Thread thread2 = new Thread(new JoinThread(),"Thread 2");

        System.out.println("Start main: ");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End main.");
    }
}

class JoinThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Start thread: " + Thread.currentThread().getName() + " running...");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        System.out.println("Well done thread: " + Thread.currentThread().getName());
    }
}
