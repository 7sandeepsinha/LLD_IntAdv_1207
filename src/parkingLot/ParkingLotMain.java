package parkingLot;

import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.models.ParkingLot;
import parkingLot.repository.GateRepository;
import parkingLot.repository.ParkingFloorRepository;
import parkingLot.repository.ParkingLotRepository;
import parkingLot.repository.ParkingSlotRepository;
import parkingLot.service.InitService;
import parkingLot.service.InitServiceImpl;

public class ParkingLotMain {
    public static void main(String[] args) throws ParkingLotNotFoundException {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        GateRepository gateRepository = new GateRepository();

        InitService initService = new InitServiceImpl(parkingSlotRepository, parkingFloorRepository, parkingLotRepository, gateRepository);
        initService.init();

        ParkingLot parkingLot = parkingLotRepository.get(1);
    }
    // break -> 8:30 AM -> 6 mins
}
