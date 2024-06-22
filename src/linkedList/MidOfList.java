package linkedList;

public class MidOfList {
    public static void main(String[] args) {
        System.out.println(new MidOfList().firstMid(new ListElements().evenElements()));
        System.out.println(new MidOfList().firstMid(new ListElements().oddElements()));
        System.out.println(new MidOfList().secondMid(new ListElements().evenElements()));
        System.out.println(new MidOfList().secondMid(new ListElements().oddElements()));        
    }

    public int firstMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public int secondMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
