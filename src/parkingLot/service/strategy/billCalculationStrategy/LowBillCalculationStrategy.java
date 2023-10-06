package parkingLot.service.strategy.billCalculationStrategy;

import parkingLot.models.Ticket;
import parkingLot.models.constants.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowBillCalculationStrategy implements BillCalculationStrategy{
    private static final int PER_HOUR_CHARGE_2_WHEELER = 50;
    private static final int PER_HOUR_CHARGE_4_WHEELER = 100;

    private static final double INCREMENT_FACTOR = 0.1;


    @Override
    public double calculateBillAmount(Ticket ticket, LocalDateTime exitTime) {
        LocalDateTime entryTime = ticket.getEntryTime();
        long totalHours = ChronoUnit.HOURS.between(exitTime, entryTime);
        int costPerHour = (ticket.getVehicle().getVehicleType().equals(VehicleType.CAR)) ? // TODO : Write a separate method to calculate per hour cost based on vehicle type
                                PER_HOUR_CHARGE_4_WHEELER :
                                PER_HOUR_CHARGE_2_WHEELER;

        double baseCost = costPerHour  * totalHours;
        return baseCost + (baseCost * (INCREMENT_FACTOR * (totalHours-1)));
    }
}

/*
   1st hour -> 50
   2nd hour -> 50 * 2 =>100 +  100 * ( 0.1 * 2-1) => 10 => 110
   3rd hour -> 50 * 3 => 150 | 150 * ( 0.1 * 3-1) => 150 * 0.2 => 30 -> 180

   formula = base cost => fixedCost * N
             totalCost => baseCost + baseCost * [ incrementFactor * [N-1]]

 */