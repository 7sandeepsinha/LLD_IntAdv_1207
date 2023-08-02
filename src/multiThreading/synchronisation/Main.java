package multiThreading.synchronisation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Count count = new Count(0);
        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start(); // +1
        t2.start(); // -1
    }
}
