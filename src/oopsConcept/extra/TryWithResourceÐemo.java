package oopsConcept.extra;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResourceÐemo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);
            FileInputStream fileInputStream = new FileInputStream(sc.next());
        ){
            // try with resources, cleans in opposite order [ not top down but bottom up ]
            int x = sc.nextInt();
            System.out.println(x);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
