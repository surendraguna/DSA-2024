package linkedList;

public class RevereseList {
    public static void main(String[] args) {
        Node head = new ListElements().oddElements();
        head = new RevereseList().reverseList(head);
        new SingleLL().display(head);
    }

    public Node reverseList(Node head) {
        Node pre = null;
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
