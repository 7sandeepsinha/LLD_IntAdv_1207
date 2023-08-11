package oopsConcept.staticFinalAbstractDemo;

public class Student {
    static int fullMarks; // we can access a static member directly using a class Name
    int marks;

    public Student() {
    }

    public Student(int marks) {
        this.marks = marks;
    }

    public Student(int fullMarks, int marks) {
        this.fullMarks = fullMarks;
        this.marks = marks;
    }

    public void printStudentMarks(){
        System.out.println("Full Marks = " + Student.fullMarks);
        System.out.println("Marks = " + this.marks);
    }

    public static void printFullMarks(Student s){
        System.out.println("Full Marks = " + Student.fullMarks);
        //System.out.println("Student individual score : " + this.marks); -> from static method we cant access non-static attribute
        System.out.println("Student individual score : " + s.marks); // s is non-static but not a variable of the same class
    }

    public static void greet(){
        System.out.println("Hello, how are you doing ? ");
    }

    // hello() -> parent -> sout(Hello Parent)
    // hello() -> parent -> sout(Hello Child)
    // Parent p = new Child();
    // p.method() -> parent class, or child class


}
/*

 */
