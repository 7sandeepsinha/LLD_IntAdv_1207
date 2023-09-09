package designPatterns.observer;

public class InventoryManagementService implements OrderPlacedSubscriber, OrderCancelledSubscriber{
    @Override
    public void onOrderPlaceAction() {
        System.out.println("Inventory updated after order placed");
    }

    @Override
    public void onOrderCancelledAction() {
        System.out.println("Inventory updated after order cancelled");
    }
}
