package multiThreading.synchronisation;

public class Count {
    private int count;

    public Count(int count) {
        this.count = count;
    }
    //synchronised method - demo
    public synchronized void increment(){
        this.count++;
    }
    // synchronised block - demo
    // synchronised(this) || synchronised(Count.class)
    // object lock        || class lock
    public void increaseCountValue(){
        System.out.println("Before sync block in increaseCountValue(), thread name : " + Thread.currentThread().getName());
        synchronized (Count.class) {
            this.count++;
        }
        System.out.println("After sync block in increaseCountValue(), thread name : " + Thread.currentThread().getName());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
// break -> 8:10 AM
