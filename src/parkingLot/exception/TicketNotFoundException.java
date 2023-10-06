package parkingLot.exception;

public class TicketNotFoundException extends Exception{
    public TicketNotFoundException() {
    }

    public TicketNotFoundException(String message) {
        super(message);
    }
}
