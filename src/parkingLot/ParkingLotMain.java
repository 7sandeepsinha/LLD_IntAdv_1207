package parkingLot;

import parkingLot.controller.TicketController;
import parkingLot.dto.TicketRequestDTO;
import parkingLot.dto.TicketResponseDTO;
import parkingLot.exception.GateNotFoundException;
import parkingLot.exception.NoEmptyParkingSlotAvailableException;
import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.models.ParkingLot;
import parkingLot.models.constants.VehicleType;
import parkingLot.repository.*;
import parkingLot.service.InitService;
import parkingLot.service.InitServiceImpl;

public class ParkingLotMain {
    public static void main(String[] args) throws ParkingLotNotFoundException, NoEmptyParkingSlotAvailableException, GateNotFoundException {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitService initService = new InitServiceImpl(parkingSlotRepository, parkingFloorRepository, parkingLotRepository, gateRepository);
        initService.init();

        TicketController ticketController = new TicketController(parkingLotRepository, gateRepository, ticketRepository);

        ParkingLot parkingLot = parkingLotRepository.get(1);

        TicketRequestDTO ticketRequestDTO = new TicketRequestDTO();
        ticketRequestDTO.setParkingLotId(1);
        ticketRequestDTO.setGateId(31);
        ticketRequestDTO.setName("Mercedez");
        ticketRequestDTO.setColor("Blue");
        ticketRequestDTO.setVehicleType(VehicleType.CAR);
        ticketRequestDTO.setNumber("1234");

        TicketResponseDTO ticketResponseDTO = ticketController.createTicket(ticketRequestDTO);
        System.out.println(ticketResponseDTO);
    }
    // break -> 8:30 AM -> 6 mins
}
