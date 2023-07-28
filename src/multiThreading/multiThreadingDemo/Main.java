package multiThreading.multiThreadingDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, from thread : " +
                Thread.currentThread().getName()); // main thread

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        hwp.run(); // main
        Thread t = new Thread(hwp);
        t.run(); // main
        t.start(); // thread 0

        System.out.println("Hello world, from thread : " +
                Thread.currentThread().getName()); // main

        int x = 10;
        int y = 5;

        Adder adder = new Adder(x,y);
        Substractor substractor = new Substractor(x,y);
        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(substractor);
        adderThread.start();
        subtractorThread.start();
    }
}
