package advancedConcepts.generics;

public class Client {
    public static void main(String[] args) {
        Box<Integer, Boolean> box = new Box<>();
        box.flag = true;
        int x = 10;
        Integer y = x; // primitive to wrapper -> Autoboxing
        int z = y; // wrapper to primitive -> Unboxing

        long a = 100;
        Integer i = 50;
        long l = i;

        int intVal = 10;
        long longVal = intVal; // implicit

        long x1 = 10;
        int i1 = (int)x1; //explicit
    }
}

//Collections -> Generics
