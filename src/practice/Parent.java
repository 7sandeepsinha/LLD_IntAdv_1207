package practice;

public class Parent {
    protected int d1 = 10;
    protected int d2 = 100;

    protected void fun1(){
        System.out.println("P's fun1");
    }

    protected void fun(){
        System.out.println("P's fun");
    }

    static protected void sfun(){
        System.out.println("P's sfun");
    }
}
