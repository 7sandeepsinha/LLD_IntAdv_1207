package designPatterns.observer;

public class RefundManagementService implements OrderCancelledSubscriber{
    @Override
    public void onOrderCancelledAction() {
        System.out.println("Refund processed after order cancelled");
    }
}
