package practice.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    private final Node root;
    ExecutorService service;
    TreeSizeCalculator(Node root, ExecutorService service){
        this.root = root;
        this.service = service;

    }


    @Override
    public Integer call() throws Exception {
        if(root == null) return 0;

        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left, service);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right, service);

        Future<Integer> leftSize = service.submit(leftTree);
        Future<Integer> rightSize = service.submit(rightTree);

        return leftSize.get() + rightSize.get() + 1;
    }
}
