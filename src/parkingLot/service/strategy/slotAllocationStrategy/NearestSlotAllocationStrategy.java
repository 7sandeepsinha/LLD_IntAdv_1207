package parkingLot.service.strategy.slotAllocationStrategy;

import parkingLot.exception.NoEmptyParkingSlotAvailableException;
import parkingLot.models.Gate;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSlot;
import parkingLot.models.constants.ParkingSlotStatus;
import parkingLot.models.constants.VehicleType;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy{
    @Override
    public ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) throws NoEmptyParkingSlotAvailableException {
        int floorNumber = entryGate.getFloorNumber();
        for(ParkingSlot slot :
                parkingLot.getParkingFloors().get(floorNumber).getParkingSlots()){
            if(slot.getSupportedVehicleType().equals(vehicleType) &&
                slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
            )
                return slot;
        }
        int i = floorNumber - 1;
        int j = floorNumber + 1;
        while(i >=0 || j < parkingLot.getParkingFloors().size()) {
            if(i >= 0){
                for(ParkingSlot slot :
                        parkingLot.getParkingFloors().get(i).getParkingSlots()){
                    if(slot.getSupportedVehicleType().equals(vehicleType) &&
                            slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
                    )
                        return slot;
                }
            }
            if(j < parkingLot.getParkingFloors().size()){
                for(ParkingSlot slot :
                        parkingLot.getParkingFloors().get(j).getParkingSlots()){
                    if(slot.getSupportedVehicleType().equals(vehicleType) &&
                            slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)
                    )
                        return slot;
                }
            }
            i--; j++;
        }
        throw new NoEmptyParkingSlotAvailableException("No available parking slot as of now, please try again later.");
    }
}

//TODO : replace the redundant code with a private method
