package oopsConcept.inheritance;

public class User {
    private int id;
    public String name;
    public String phoneNumber;

    public User() {
    }

    public User(int id, String name, String phoneNumber) {
        this(id, name); // this is always the first line of the constructor
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String name) {
        this(id);
        this.name = name;
    }

    public User(int id) {
        this.id = id;
    }

    public void greet(){
        this.helloWorld();
        System.out.println("Hi everyone!");
    }

    public void helloWorld(){
        System.out.println("Hello World");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
