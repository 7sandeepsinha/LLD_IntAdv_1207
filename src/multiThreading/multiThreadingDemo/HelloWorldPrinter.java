package multiThreading.multiThreadingDemo;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World, from thread : " +
                Thread.currentThread().getName());
    }
}
// extend a Thread class
// implement Runnable interface

// Note possible to send a parameter to run or return something from run