package multiThreading.synchronisation;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.lock = lock;
        this.count = count;
    }


    @Override
    public void run() {
        System.out.println("Hi, Subtractor");
        lock.lock(); // T2 taking a lock time 2ms
        for(int i=0;i<10000;i++) {
            count.setCount(count.getCount() - 1);
        }
        System.out.println("Count Subtractor: " + count.getCount());
        lock.unlock();
        System.out.println("Bye, Subtractor");
    }
}

