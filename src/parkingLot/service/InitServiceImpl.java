package parkingLot.service;

import parkingLot.models.*;
import parkingLot.models.constants.*;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingFloorRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.ParkingSlotRepository;
import parkingLot.service.strategy.billCalculationStrategy.BillCalculationStrategyFactory;
import parkingLot.service.strategy.slotAllocationStrategy.SlotAllocationStrategyFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitServiceImpl implements InitService {
    private ParkingSlotRepository parkingSlotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;

    public InitServiceImpl(ParkingSlotRepository parkingSlotRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository, GateRepository gateRepository) {
        this.parkingSlotRepository = parkingSlotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;
    }

    @Override
    public void init() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setName("Parking Lot 1");
        parkingLot.setAddress("Street A, City B, State C");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setSupportedVehicleTypes(new ArrayList<>(Arrays.asList(
                VehicleType.BIKE, VehicleType.CAR
        )));
        parkingLot.setSlotAllocationStrategy(SlotAllocationStrategyFactory.getSlotAllocationStrategy());
        parkingLot.setBillCalculationStrategy(BillCalculationStrategyFactory.getBillCalculationStrategy());

        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ParkingFloor floor = new ParkingFloor();
            floor.setId(i);
            floor.setFloorNumber(i);
            List<ParkingSlot> parkingSlots = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                VehicleType supportedVehicleType = j % 2 != 0 ?
                        VehicleType.BIKE : VehicleType.CAR;
                ParkingSlot parkingSlot = new ParkingSlot(i * 100 + j, i * 100 + j, supportedVehicleType);
                parkingSlots.add(parkingSlot);
                parkingSlotRepository.put(parkingSlot);
            }
            floor.setParkingSlots(parkingSlots);
            floor.setParkingFloorStatus(ParkingFloorStatus.OPEN);

            Gate entryGate = new Gate();
            entryGate.setId(i * 10 + 1);
            entryGate.setGateNumber(i * 10 + 1);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperator("Rahul");
            entryGate.setParkingLotId(1);
            entryGate.setFloorNumber(i);
            gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId(i * 10 + 2);
            exitGate.setGateNumber(i * 10 + 2);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperator("Ram");
            exitGate.setParkingLotId(1);
            entryGate.setFloorNumber(i);
            gateRepository.put(exitGate);

            List<Gate> gates = new ArrayList<>(Arrays.asList(entryGate,exitGate));
            floor.setGates(gates);
            parkingFloorRepository.put(floor);

            parkingFloors.add(floor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        parkingLotRepository.put(parkingLot);
    }
}
/*
    Floor 1 -> 100 slots
    100th slot will get number -> 1*100 + 100 -> 200 [second floor]
 */