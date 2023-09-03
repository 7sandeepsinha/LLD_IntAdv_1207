package oopsConcept.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Mac", 100000, 30000, 150),
                new Product("watch", 50000, 25000, 200),
                new Product("iphone", 80000, 30000, 500),
                new Product("airpods", 20000, 3000, 250))
        );
        // desc -> Mac/Iphone/watch/airpods
        // asc -> airpods/watch/mac/iphone
        System.out.println("Before sort : " + products);
        Collections.sort(products); // default sort is based on compareTo from comparable
        System.out.println("After sort : " + products);

        Collections.sort(products, new ProductPriceComparator());
        System.out.println("After sort using price: " + products);
    }


    // sort(collection) -> Arrays.sort(data, method from comparable -> comparator)
    // sort(collection, comparator) -> Arrays.sort(data, comparator passed from user)
}
