package oopsConcept.exception;

public class Calculator {
    public int divide(String greeting, String a, String b){
        try { // only a try block is not possible
            System.out.println(greeting.toUpperCase());
            int aVal = Integer.parseInt(a);
            int bVal = Integer.parseInt(b);
            System.out.println("Hello world");
            return aVal/bVal;
            // making a call to another micro-service //408 -> retry, 404 -> no retry
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.out.println("Zero passed as denominator");
            return 25;
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            System.out.println("Invalid format for number passed");
            return 50;
        } finally {
            // write the code to free up the resources being used in the try block
            System.out.println("Hi, from inside of finally block");
        }
    }

    public int calculateLengthOfString(String str){
        return str.length();
    }
}