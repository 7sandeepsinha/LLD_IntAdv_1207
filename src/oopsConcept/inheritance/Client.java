package oopsConcept.inheritance;

public class Client {
    public static void main(String[] args) {
        Mentor m = new Mentor(1,5);
        m.setId(1);
        m.name = "Kiran";
        m.phoneNumber = "1234";
        m.greet();

        User u = new User(1, "Satya", "5678");


        User user = new Mentor(); // upcasting, implicit casting
        user.helloWorld();
        user.greet();
        //user.greetFromMentor(); -> additional features are being able to use

        Mentor mentor = (Mentor)new User(); // downcasting, explicit casting
        mentor.greetFromMentor(); // runtime exception

        printName(new Mentor());
        printName(new User());
        //printName(new Student());
    }

    public static void printName(User user){
        System.out.println(user.getName());
    }
}
