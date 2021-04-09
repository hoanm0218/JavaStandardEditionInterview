package com.hoanm.thread.threadmethod.sleep;

public class MainSleepExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println("Start thread from 1 to 4: ");
            for(int i = 1; i < 5; i++){
                System.out.println("Start thread: " + i + " and need stop 1s to start next thread.\n");
                try{
                    Thread.sleep(Long.parseLong("1000"));
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
            System.out.println("Well done.");
        });

        thread1.start();
    }
}
