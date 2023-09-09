package designPatterns.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{
    @Override
    public void onOrderPlaceAction() {
        // write the logic for invoice generation
        System.out.println("Invoice Generated after order placed");
    }
}
