package parkingLot.service.strategy.billCalculationStrategy;

import parkingLot.models.Ticket;

import java.time.LocalDateTime;

public interface BillCalculationStrategy {
    double calculateBillAmount(Ticket ticket, LocalDateTime exitTime);
}
