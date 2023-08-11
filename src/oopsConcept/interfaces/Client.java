package oopsConcept.interfaces;

public class Client {
    public static void main(String[] args) {
//        Travel travelWithTata = new Travel(new Tata());
//        travelWithTata.travel();
//
//        Travel travelWithMahindra = new Travel(new Mahindra());
//        travelWithMahindra.travel();

        Travel t = new Travel(new Tata());
        t.travel();
    }
}
