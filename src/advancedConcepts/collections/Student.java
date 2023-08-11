package advancedConcepts.collections;

import java.util.Objects;

public class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return 1;
//    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

/*
                Parent

             A          B          C
           A1 A2 A3

             hashMap<Parent,TimeStamp>

             A | B | C -> equals


             hashcode -> collisions, wont be visible to end user

 */