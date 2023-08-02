package multiThreading.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberGenerator generator1 = new RandomNumberGenerator();
        RandomNumberGenerator generator2 = new RandomNumberGenerator();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> x = executor.submit(generator1);
        Future<Integer> y = executor.submit(generator2);
        System.out.println("Main thread line print before get");
        System.out.println("X value : " + x.get());
        System.out.println("Y value : " + y.get());
        System.out.println("Main thread line print");
        int sum = x.get() + y.get();
        System.out.println("Sum : " + sum);
        executor.shutdown();
        // get is a blocking call, it will block the main thread execution
    }
}
