package multiThreading.synchronisation;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }


    @Override
    public void run() {
        System.out.println("Hi, adder");
        lock.lock();
        for(int i=0;i<10000;i++) {
            count.setCount(count.getCount() + 1);
        }
        System.out.println("Count Adder: " + count.getCount());
        lock.unlock();
        System.out.println("Bye, adder");
    }
}

