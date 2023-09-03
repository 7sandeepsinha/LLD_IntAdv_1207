package oopsConcept.extra;

import java.util.Comparator;

public class ProductRatingComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return (int) (product1.getRating() - product2.getRating());
    }
}
