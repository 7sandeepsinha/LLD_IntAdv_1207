package designPatterns.strategy;

public class CarPathCalculator implements PathCalculator{
    private static CarPathCalculator instance;

    private CarPathCalculator() {
    }

    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path calculated on Car from : " + source + " to " + destination );
    }

    public static CarPathCalculator getInstance(){
        if(instance == null){
            instance = new CarPathCalculator();
        }
        return instance;
    }
}
// NOTE -> if the strategy does not have any attributes, it can be made into singleton for space optimisation