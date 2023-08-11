package oopsConcept.staticFinalAbstractDemo;

public class StaticDemo {

    public static void main(String[] args) {
        Student.fullMarks = 50;
        Student s1 = new Student(42);
        Student s2 = new Student(45);
        Student s3 = new Student(48);

        s3.fullMarks = 60; // not a good practice, we should access static variables using ClassName instead of object

        System.out.println("FullMarks, scoredMarks for s1 : " + s1.fullMarks + ", " + s1.marks);
        System.out.println("FullMarks, scoredMarks for s2 : " + s2.fullMarks + ", " + s2.marks);
        System.out.println("FullMarks, scoredMarks for s3 : " + s3.fullMarks + ", " + s3.marks);


        Student sObj = new Student(45);
        sObj.printStudentMarks();


        sObj.greet();

        IntelligentStudent intelliJStu =
                new IntelligentStudent();
        intelliJStu.greet(); // intelliJStu -> IntelligentStudent -> IntelligentStudent.greet();


        Student sRef = new IntelligentStudent();
        sRef.greet(); // sRef -> Student -> Student.greet();
    }
}
