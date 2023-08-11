package oopsConcept.staticFinalAbstractDemo;

public class Client {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println(x);
        System.out.println(y);

        System.out.println("--------------");

        Point p = new Point();
        p.x = 10;
        p.y = 20;
        swap(p);
        System.out.println(p.x);
        System.out.println(p.y);
    }

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swap(Point p){
       int temp = p.x;
       p.x = p.y;
       p.y = temp;
    }
}

class Point {
    int x;
    int y;

}