package oopsConcept.inheritance;

public class Mentor extends User {
    public int rating;

    public Mentor() {
    }

    public Mentor(int id, String name, String phone){
        super(id, name, phone);
    }

    public Mentor(int id, int rating) {
        //super(); -> trying to call the default cons of parent class
        super(id); // super is always the first line of the constructor
        // ability to call parent constructor from child class, is called constructor chanining
        this.rating = rating;
    }

    public void greetAll(){
        super.greet();
        super.helloWorld();
    }

    public String getName(){
        return super.name;
    }

    public void greetFromMentor(){
        System.out.println("Hello everyone, I am your mentor");
    }
}

//Getter and Setter for a private member in parent class, is not possible from child class



// class ChildClass extends ParentClass