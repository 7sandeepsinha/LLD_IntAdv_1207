package practice.constructors;

public class Student {
    int age;
    String name;

    Student(){
        this(0, null);
    }

    Student(int age){
        this(age, null);
    }

    Student(String name){
        this(0, name);
    }

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

}
