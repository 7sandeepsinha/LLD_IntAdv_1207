package practice.multithreading;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable {

    int n;
    List<Integer> list;
    public ArrayCreator(int n){
        this.n = n;
       // list = new ArrayList<>();
    }
    @Override
    public Object call() throws Exception {
        list = new ArrayList<>();
        for(int i =1; i<=n;i++){
            list.add(i);
        }
        System.out.println("Thread name : "+ Thread.currentThread().getName());
        return list;
    }
}
