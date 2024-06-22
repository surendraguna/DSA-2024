package linkedList;

public class DoubleLL implements MyLinkedList{

    private Node head = null;
    
    public Node getHead() {
        return head;
    }

    @Override
    public void insertAtHead(int value) {
        if(head == null) {
            head = new Node(value); 
            return;
        }
        Node n = new Node(value);
        n.next = head;
        head.prev = n;
        head = n; 
    }

    @Override
    public void insertAtEnd(int value) {
        if(head == null) {
            insertAtHead(value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(value);
        temp.next.prev = temp;
    }

    @Override
    public void insertAtIndex(int index, int value) {
        if(head == null && index > 0) return;
        if (index == 0) {
            insertAtHead(value);
            return;
        }

        Node temp = head;
        while (temp != null && index-- > 1) 
            temp = temp.next;
        if(temp == null)
            return;
        Node n = new Node(value);
        if(temp.next != null)
            temp.next.prev = n;
        n.prev = temp;
        n.next = temp.next;
        temp.next = n;
    }

    @Override
    public void removeAtHead() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    @Override
    public void removeAtLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    @Override
    public void removeAtIndex(int index) {
        if(head == null && index > 0) return;
        if (index == 0) {
            removeAtHead();
            return;
        }
        Node temp = head;
        while (temp != null && index-- > 1) 
            temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
        if(temp.next != null)
            temp.next.prev = temp;
    }

    @Override
    public void display() {
        if(head == null)    
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public void getNodeAtIndex(int index) {
        if(head == null) return;
        Node temp = head;
        while (temp != null && index-- > 0) 
            temp = temp.next;
        if(temp == null) return;
        System.out.println(temp.data);
    }

    public Node reverse (Node head) {
        if(head == null)    
            return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void display (Node head) {
        if(head == null)
            return;
        Node temp = reverse(head);
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
}
