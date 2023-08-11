package oopsConcept.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

            Vehicle demoVehicle = new ICECar();

            ICECar demoIceCar = new ICECar();
            Vehicle IceVehicle = demoIceCar;

//        System.out.println("Hello World");
//        System.out.println(1);
//        System.out.println(true);
//        System.out.println();
//        System.out.println(new Car());

        Vehicle v = new Vehicle();
        v.startEngine();

        ICECar iceCar = new ICECar();
        iceCar.startEngine();
        System.out.println("-----------");
        iceCar.startEnginesDemo();
        /*
            Vehicle has 3 methods
            ICECar has total 5 methods, 3 inherited, and 2 new
            Out of the 3 inherited 2 are overridden
         */

        Vehicle vehicle = new ICECar();
        //using the vehicle ref variable, how many method will I be able to call -> 3
        vehicle.startEngine(); // method will be executed from IceCar
        vehicle.startAC(); // method executed will have same logic as Vehicle
        vehicle.startMedia(); // method will be executed from IceCar
        // vehicle.autoUnlockDoors() -> not doable
        System.out.println("------UPCASTING ADVANTAGE-------");
        List<Vehicle> vehicles = new ArrayList<>();
        ICECar maruti = new ICECar();
        ICECar mahindra = new ICECar();
        ElectricCar tata = new ElectricCar();
        ElectricCar tesla = new ElectricCar();
        vehicles.add(mahindra); // internally upcasts mahindra[ICECar type] object to vehicle reference variable
        vehicles.add(maruti);
        vehicles.add(tata);
        vehicles.add(tesla);
        startAllCars(vehicles);

        Vehicle v1 = new ElectricCar();
        v1.startEngine(); // method executed will be coming from ElectricCar
        Vehicle v2 = new AdvancedElectricCar();
        v2.startEngine(); // method executed will be coming from AdvancedElectricCar
        ElectricCar ec = new AdvancedElectricCar();
        ec.startEngine(); // method executed will be coming from AdvancedElectricCar
        AdvancedElectricCar adv = new AdvancedElectricCar();
        adv.startAC(); // advElectric inherited from Electric and electric from Vehicle

    }

    public static void startAllCars(List<Vehicle> vehicles){
        for(Vehicle v : vehicles){
            v.startEngine();
        }
    }
}