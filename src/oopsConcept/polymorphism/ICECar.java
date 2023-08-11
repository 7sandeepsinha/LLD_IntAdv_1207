package oopsConcept.polymorphism;

public class ICECar extends Vehicle{

    @Override // optional and has no functionality -> increases readability & checks for override
    public void startEngine(){
        System.out.println("ICE Car engine is starting");
    }

    @Override
    public void startMedia(){
        System.out.println("Starting media via bluetooth");
    }

    public void startEnginesDemo(){
        super.startEngine();
        this.startEngine();
        System.out.println("Demo");
    }

    public void autoUnlockDoors(){
        System.out.println("Doors are unlocked automatically");
    }


    //public void startAC() -> inherited method
}
