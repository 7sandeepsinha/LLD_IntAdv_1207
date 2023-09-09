package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InventoryManagementService inventoryManagementService = new InventoryManagementService();

        Amazon amazon = new Amazon();
        amazon.register(notificationService);
        amazon.register(invoiceGenerator);
        amazon.register(inventoryManagementService);
        amazon.orderPlaced();
        System.out.println("---------------------");
        amazon.deRegister(invoiceGenerator);
        amazon.orderPlaced();

    }
}
