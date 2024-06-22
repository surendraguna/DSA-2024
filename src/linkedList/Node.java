package linkedList;

public class Node {
    int data;
    Node next;
    Node prev;
    public Node(){}
    Node (int data) {
        this.data = data;
        next = prev = null;
    }
    Node(Node node) {
       this.data = node.data;
       this.next = (node.next != null) ? new Node(node.next) : null;
    }
}
