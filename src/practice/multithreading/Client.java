package practice.multithreading;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner s = new Scanner(System.in);

        // Additional Problems : Concurrency-2 : Executors and Callables
        /*
        int n = s.nextInt();
        ArrayCreator t1 = new ArrayCreator(n);
        ExecutorService exec = Executors.newFixedThreadPool(1);
        Future<List<Integer>> list = exec.submit(t1);
        System.out.println(list.get());
        exec.shutdown();
        */

        // Additional Problems : Concurrency-1: Intro to Process and Threads

        int x = s.nextInt();
        int y = s.nextInt();

        Adder add = new Adder(x, y);
        Thread t1 = new Thread(add);
        t1.start();

    }
}
