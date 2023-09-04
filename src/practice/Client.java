package practice;

public class Client {
    public static void main(String[] args) {
        Child obj = (Child) new Parent();
        System.out.println(obj.d1);
        System.out.println(obj.d4);
        //obj.fun1();

    }
}


