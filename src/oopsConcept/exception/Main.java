package oopsConcept.exception;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.divide("Hi","15","5"));

        Product p = new Product();
        p.getProductName("123");
    }
}
