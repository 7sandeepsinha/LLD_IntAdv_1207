package practice.constructors;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        Node check = new Node(10);
        check.next = new Node(20);
        Node check2 = new Node(30);
        Node copy = new Node(check);
        Node copy2 = new Node(check2);
        check.next.data = 30;
        System.out.println(check.next.data);
        System.out.println(copy.next.data);

    }
}
