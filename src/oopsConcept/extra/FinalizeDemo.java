package oopsConcept.extra;

public class FinalizeDemo {

    @Override
    protected void finalize(){
        System.out.println("Finalise method is being called");
    }

    public static void main(String[] args) {
        FinalizeDemo f1 = new FinalizeDemo();
        FinalizeDemo f2 = new FinalizeDemo();

        f1 = null; // ref variables become null, thus the objects become garbage
        f2 = null; // ref variables become null, thus the objects become garbage

        System.gc(); // requesting garbage collector to come and clear

        System.out.println("End of code");
    }
}
