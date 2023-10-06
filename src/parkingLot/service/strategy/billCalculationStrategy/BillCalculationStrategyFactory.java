package parkingLot.service.strategy.billCalculationStrategy;

public class BillCalculationStrategyFactory {
    //TODO : add enum for different strategies, keep it as param and add switch case
    public static BillCalculationStrategy getBillCalculationStrategy(){
        return new LowBillCalculationStrategy();
    }
}
