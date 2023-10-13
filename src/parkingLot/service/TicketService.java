package parkingLot.service;

import parkingLot.exception.GateNotFoundException;
import parkingLot.exception.NoEmptyParkingSlotAvailableException;
import parkingLot.exception.ParkingLotNotFoundException;
import parkingLot.models.Ticket;
import parkingLot.models.Vehicle;

import java.time.LocalDateTime;

public interface TicketService {
    Ticket createTicket(Vehicle vehicle, int gateId, int parkingLotId, LocalDateTime entryTime) throws ParkingLotNotFoundException, GateNotFoundException, NoEmptyParkingSlotAvailableException;
}
