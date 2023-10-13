package parkingLot.exception;

public class NoEmptyParkingSlotAvailableException extends Exception{
    public NoEmptyParkingSlotAvailableException() {
    }

    public NoEmptyParkingSlotAvailableException(String message) {
        super(message);
    }
}
