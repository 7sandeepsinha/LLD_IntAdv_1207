package practice.constructors;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    Node(Node n){
        this.data = n.data;
        this.next = n.next != null ? new Node(n.next.data) : null;
    }
}
