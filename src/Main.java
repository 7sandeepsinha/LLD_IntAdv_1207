import oopsConcept.accessModifiers.school.Student;

public class Main extends Student{ // Inheritance
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student s = new Student();
        s.rank = 20;
        System.out.println(s.rank);
        // s.marks = 95; -> marks is default, so not accessible outside the same package
    }

    public void demoMethod(){
        Main main = new Main();
        main.name = "Student name";
        Student s = new Student();
        // s.name = "name";
        // main.address = ""; -> even after oopsConcept.inheritance, private is not accessible
    }
}