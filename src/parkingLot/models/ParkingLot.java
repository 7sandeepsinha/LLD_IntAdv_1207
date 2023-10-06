package parkingLot.models;

import parkingLot.models.constants.ParkingLotStatus;
import parkingLot.models.constants.VehicleType;
import parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategy;
import parkingLot.service.strategy.slotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> supportedVehicleTypes;
    private SlotAllocationStrategy slotAllocationStrategy;
    private BillCalculationStrategy billCalculationStrategy;
}
