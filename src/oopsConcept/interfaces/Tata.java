package oopsConcept.interfaces;

public class Tata implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Start engine in TATA");
    }

    @Override
    public void startAC() {
        System.out.println("Start AC in TATA");
    }

    @Override
    public void startMedia() {
        System.out.println("Start media in TATA");
    }
}
