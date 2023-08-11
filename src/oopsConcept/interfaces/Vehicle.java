package oopsConcept.interfaces;

public interface Vehicle {
    void startEngine();
    void startAC();
    void startMedia();
}
// With interface we are setting up a contract, that every child of Vehicle will have
// the methods present inside Vehicle and will have their own implementation

// We cant create objects of an interface
