package com.hoanm.thread.threadmethod.waitandnotifyandnotifyall;

public class MainTransactionExample {
    public static void main(String[] args) {

        final TransactionService transactionService = new TransactionService();

        Thread thread1 = new Thread(() -> transactionService.withDraw(10000));
        Thread thread2 = new Thread(() -> {
            transactionService.deposit(5000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Exception with: " + e);
            }
            transactionService.deposit(10000);
        });

        thread1.start();
        thread2.start();
    }
}
