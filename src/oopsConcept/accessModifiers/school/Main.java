package oopsConcept.accessModifiers.school;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // creating a student object s
        s.rank = 10;
        System.out.println(s.rank);
        s.marks = 95;
        System.out.println(s.marks);
        //s.address = "New city, new town"; -> address is not accessible because it is private
        s.setAddress("Koramangla, Bangalore");
        System.out.println(s.getAddress());
    }
}
