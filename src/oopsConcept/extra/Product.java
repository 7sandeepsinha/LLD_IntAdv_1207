package oopsConcept.extra;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private double margin;
    private int sales;
    private int rating;

    public Product(String name, double price, double margin, int sales) {
        this.name = name;
        this.price = price;
        this.margin = margin;
        this.sales = sales;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.margin - product.margin);
        // prod1.compareTo(prod2);
        // 0 if equal margin
        // -ve if current prod2 margin is bigger
        // +ve if prod1 margin is better
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", margin=" + margin +
                ", sales=" + sales +
                '}';
    }
}

//