package oopsConcept.constructors;

public class Car {
    String name; // default value is null
    String brand; // default value is null
    int noOfSeats; // 0
    int engineSize; // 0

    // IF THERE IS NO CONSTRUCTOR [ absolutely 0 ] then only Java provides a default constructor

//    public Car(){ // default constructor
//    }

    // no args constructor
    public Car(){ // Car()
        name = "car";
        brand = "automobile company";
        noOfSeats = 5;
        engineSize = 1500;
    }

    //parameterised constructor - takes input values to initialise the attributes of the class during object creation
    public Car(String carName, String carBrand, int carNoOfSeats, int carEngineSize){ // Car(String, String, int, int)
        System.out.println("Currently inside the car parameterised constructor");
        name = carName;
        brand = carBrand;
        noOfSeats = carNoOfSeats;
        engineSize = carEngineSize;
    }

    //parameterised constructor
    public Car(String carBrand, int carNoOfSeats, int carEngineSize){ // Car(String, int, int)
        brand = carBrand;
        noOfSeats = carNoOfSeats;
        engineSize = carEngineSize;
    }

    public Car(int engineSizeICE, int engineSizeElectric, String carName, String carBrandName, int carNoOfSeats){
        engineSize = engineSizeElectric + engineSizeICE;
        name = carName;
        brand = carBrandName;
        noOfSeats = carNoOfSeats;
    }

    public Car(Car c){
        name = c.name;
        brand = c.brand;
        engineSize = c.engineSize;
        noOfSeats = c.noOfSeats;
    }
}
