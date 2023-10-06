package parkingLot.exception;

public class GateNotFoundException extends Exception{
    public GateNotFoundException() {
    }

    public GateNotFoundException(String message) {
        super(message);
    }
}
