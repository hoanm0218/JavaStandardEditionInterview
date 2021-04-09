package hoanm.thread.deadlock;

public class DeadlockThread implements Runnable{

    private Object object1;
    private Object object2;

    public DeadlockThread(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public void run() {
        String nameOfThread = Thread.currentThread().getName();

        synchronized (object1){
            System.out.println(nameOfThread + " acquiring lock on: " + object1 + " and need: " + object2 + "to used.");
            work();

            synchronized (object2) {
                //Avoid nested lock
                System.out.println(nameOfThread + " acquired lock on: " + object2);
                work();
            }
            System.out.println(nameOfThread + " released lock on: " + object2);
        }
        System.out.println(nameOfThread + " released lock on " + object1);
    }
    private void work(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
