package designPatterns.strategy;

public class WalkPathCalculator implements PathCalculator{
    @Override
    public void calculatePath(String source, String destination) {
        System.out.println("Path calculated on walk from : " + source + " to " + destination );
    }
}
