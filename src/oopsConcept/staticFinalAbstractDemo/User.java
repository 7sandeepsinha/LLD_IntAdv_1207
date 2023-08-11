package oopsConcept.staticFinalAbstractDemo;

public class User {
    public static final String galaxy = "Milky Way"; // milky way galaxy
    public final String bloodGroup;

    public User(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
// Final keyword -> attribute -> cant change the value, value cant be go un-initialised or default initialisation
// Final keyword -> method -> override is not possible
// Final keyword -> class -> extend is not possible

// H/W -> final methods cant be overridden, static methods can be overridden,
// can we override final static methods ?

// H/W -> Read about static block/static oopsConcept.constructors

// bio break -> 3 mins -> 10:20 PM