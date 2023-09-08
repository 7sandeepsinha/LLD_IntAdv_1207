package designPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Airport", "Station", TransportationMode.BIKE);
        Math.random();
    }
}

/*
     fintech -> Aadhaar verification

     C1,    C2
     10rs   15rs
     8rs    12rs

     both -> need to have a fallback option
     80% calls -> C1
     20% calls -> C2

     10 calls -> 8 C1 and 2 C2

     Math.random() -> 1 to 10 : equal probability
     100 -> 1 - 10 times, 2 - 10 times, 3 - 10 times

     random() -> 1 to 10

     if(Math.random() <= 8)
            C1
     else
            C2

 */

// break -> 8 mins -> 8:28 AM IST