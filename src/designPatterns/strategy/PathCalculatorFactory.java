package designPatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(TransportationMode transportationMode){
        return switch (transportationMode){
            case CAR -> CarPathCalculator.getInstance();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
