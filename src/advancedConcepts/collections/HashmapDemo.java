package advancedConcepts.collections;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Student, Integer> studentMarksMap
                = new HashMap<>();
        Student parth = new Student("parth");
        Student raj = new Student("raj");
        Student ravi = new Student("ravi");
        Student mayur = new Student("mayur");

        studentMarksMap.put(parth,99);
        studentMarksMap.put(raj,98);
        studentMarksMap.put(ravi,97);
        studentMarksMap.put(mayur,96);
        // hashmap does not maintain insertion order
        System.out.println(studentMarksMap.size());
        System.out.println(studentMarksMap);
    }
}
