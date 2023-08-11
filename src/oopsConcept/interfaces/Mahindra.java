package oopsConcept.interfaces;

public class Mahindra implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Start engine in Mahindra");
    }

    @Override
    public void startAC() {
        System.out.println("Start AC in Mahindra");
    }

    @Override
    public void startMedia() {
        System.out.println("Start media in Mahindra");
    }
}
