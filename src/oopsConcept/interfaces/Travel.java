package oopsConcept.interfaces;

public class Travel {
    public Vehicle vehicle;

    public Travel(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travel(){
        System.out.println("Starting with the trip");
        vehicle.startEngine();
        vehicle.startAC();
        vehicle.startMedia();
    }
}

