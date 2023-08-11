package oopsConcept.accessModifiers.school;

public class Student {
    int marks; // default or package private
    public int rank;
    private String address;
    protected String name; // accessible outside the same package only to child classes

    public String getAddress(){
        return address;
    }

    public void setAddress(String studentAddress){
        address = studentAddress;
    }
}
