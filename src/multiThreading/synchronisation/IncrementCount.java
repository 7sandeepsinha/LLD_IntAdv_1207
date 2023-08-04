package multiThreading.synchronisation;

public class IncrementCount implements Runnable{
    private Count count;

    public IncrementCount(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            count.increaseCountValue();
        }
        System.out.println("Thread completes, " + Thread.currentThread().getName());
    }
}
