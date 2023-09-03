package oopsConcept.extra;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.getPrice() - product2.getPrice());
    }
}

// break 6 mins -> 10:10 PM
