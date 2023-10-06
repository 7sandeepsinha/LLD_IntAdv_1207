package parkingLot.service.strategy.slotAllocationStrategy;

import parkingLot.models.Gate;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSlot;
import parkingLot.models.constants.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate);
}

//8:08 AM -> break