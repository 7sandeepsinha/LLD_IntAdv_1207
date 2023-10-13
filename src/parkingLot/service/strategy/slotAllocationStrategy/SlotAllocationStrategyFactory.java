package parkingLot.service.strategy.slotAllocationStrategy;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy getSlotAllocationStrategy(){
        return new NearestSlotAllocationStrategy();
    }

    // TODO : replace this method with proper switch case
}
