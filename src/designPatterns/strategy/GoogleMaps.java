package designPatterns.strategy;

public class GoogleMaps {
    public void findPath(String source, String destination, TransportationMode mode){
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        pathCalculator.calculatePath(source, destination);
    }
}
/*
        1> Razorpay -> UPI -> 1rs, Debit -> 2rs, Credit -> 3rs

        2>
        Razorpay -> UPI -> 1rs
        JusPay -> Debit -> 1.5rs
        GoPay -> Credit -> 2 rs


        strategy + adapter
        each strategy impl will have its own adapter
 */