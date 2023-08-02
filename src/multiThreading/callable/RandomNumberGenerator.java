package multiThreading.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        return random.nextInt();
    }
}
