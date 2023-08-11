package oopsConcept.constructors;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.engineSize = 800;
        c1.noOfSeats = 5;
        c1.name = "Maruti 800";
        c1.brand = "Maruti Suzuki";

        Car c2 = new Car();
        c2.engineSize = 1500;
        c2.noOfSeats = 5;
        c2.name = "Grand Vitara";
        c2.brand = "Maruti Suzuki";

        Car c3 = new Car("G wagon", "Mercedez Benz", 5, 4000);

        Car c4 = new Car("Mahindra", 4, 2000);
        c4.name = "5 door Thar";

        Phone iphone13 = new Phone("Iphone", "Apple", 13, 6,
        3000, 12, 2, 4, 65000 );

        Phone iphone14 = new Phone(iphone13);

        Phone iphone15 = new Phone(iphone14); //deep
        Phone iphone16 = iphone14; // shallow
    }
}
