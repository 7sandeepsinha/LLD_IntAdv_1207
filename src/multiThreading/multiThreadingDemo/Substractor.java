package multiThreading.multiThreadingDemo;

public class Substractor implements Runnable {
    private int x;
    private int y;

    public Substractor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("SUM is : " + (x-y) + ", from thread : " +
                Thread.currentThread().getName());
    }
}
