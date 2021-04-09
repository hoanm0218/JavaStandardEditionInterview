package com.hoanm.thread.threadmethod.waitandnotifyandnotifyall;

public class TransactionService {

    private int balance = 1000;

    public TransactionService() {
        System.out.println("Your account balance: " + balance);
    }

    public synchronized void withDraw(int amount) {
        System.out.println("With draw are processing with amount: " + amount + "$ ...");
        while (balance < amount) {
            System.out.println("Not enough money!!!");
            try {
                wait();
                // Chờ nạp tiền
            } catch (InterruptedException ie) {
                System.out.println(ie.toString());
            }
        }
        balance -= amount;
        System.out.println("With draw success. Your account balance current: " + balance + "$");
    }

    public synchronized void deposit(int amount) {
        System.out.println("Deposit are processing with amount: " + amount + "$ ...");
        balance += amount;
        System.out.println("Deposit success. Your account balance current: " + balance + "$");
        //notify();
        // Đánh thức 1 thread ngẫu nhiêu đang wait đợi enough amount
        notifyAll();
        // Đánh thức tất cả các thread đang wait đợi enough amount
    }
}
