package oopsConcept.exception;

public class Product {

    public void getProductName(String productId){
        try{
            if(productId == null) {
                throw new ProductNotFoundException("Product Id is null");
            } else {
                System.out.println("Searching for product name");
            }
            throw new NullPointerException();
        } catch (ProductNotFoundException pe){
            pe.printStackTrace();
            System.out.println("Catching product name");
        }
    }
}
// new ClassName();