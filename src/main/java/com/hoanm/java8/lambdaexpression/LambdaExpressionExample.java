package com.hoanm.java8.lambdaexpression;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        //Nếu thông thường khi chúng ta muốn tạo ra 1 Thread thì cần phải truyền vào 1 runnable. Có nghĩa chúng ta phải
        //khai báo và triển khai phương thức run() của interface Runnable.
        Thread thread1 = new Thread(() -> System.out.println("Đây là phương thức run() được triển khai từ cú pháp Lambda"));
        thread1.start();
    }
}
