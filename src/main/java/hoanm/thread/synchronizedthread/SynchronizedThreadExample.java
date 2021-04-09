package hoanm.thread.synchronizedthread;

import java.util.*;

public class SynchronizedThreadExample {

    public static void main(String[] args) {
        //synchronized all operation of List,Set,Map
        List<String> listString = new ArrayList<>();
        Collections.synchronizedList(listString);
        Set<String> setString = new HashSet<>();
        Collections.synchronizedSet(setString);
        Map<Integer, String> mapIntegerString = new HashMap<>();
        Collections.synchronizedMap(mapIntegerString);

    }

    private static SynchronizedThreadExample instance;

    // Synchronized Method: None-staic operation
    public synchronized void lockedByThis() {
        System.out.println(" This synchronized operation is locked by current, instance of object, i.e. this");
    }

    // Synchronized Method: Static operation
    public static synchronized SynchronizedThreadExample lockedByClassLock() {
        System.out.println("This static synchronized operation is locked by class level lock of this class,  "
                + "i.e. SychronizationExample.class");
        if (instance == null) {
            instance = new SynchronizedThreadExample();
        }

        return instance;
    }

    // Synchronized block
    public static synchronized SynchronizedThreadExample lockedBySynchronizedBlock() {
        System.out.println("This line is executed without locking");
        if (instance == null) {
            synchronized (instance) {
                // synchronized (SynchronizationExample.class)
                // Thread Safe. Might be costly operation in some case
                if (instance == null) {
                    instance = new SynchronizedThreadExample();
                }
            }
        }
        return instance;
    }


}
