package designpattern.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

class Test {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> System.out.println(ThreadSafeSingleton.getInstance()));
        Thread thread2 = new Thread(() -> System.out.println(ThreadSafeSingleton.getInstance()));

        thread1.start();
        thread2.start();
    }
}
