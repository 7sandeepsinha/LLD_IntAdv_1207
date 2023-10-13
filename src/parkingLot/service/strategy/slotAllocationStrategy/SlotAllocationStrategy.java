package parkingLot.service.strategy.slotAllocationStrategy;

import parkingLot.exception.NoEmptyParkingSlotAvailableException;
import parkingLot.models.Gate;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSlot;
import parkingLot.models.constants.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) throws NoEmptyParkingSlotAvailableException;
}