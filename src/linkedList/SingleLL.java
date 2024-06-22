package linkedList;

public class SingleLL implements MyLinkedList{
    
    private Node head = null;

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    @Override
    public void insertAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    @Override
    public void insertAtEnd(int val) {
        if(head == null) insertAtHead(val);
        else {
            Node temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new Node(val);
        }
    }

    @Override
    public void insertAtIndex(int ind, int val) {
        if(head == null && ind > 0) return;
        if(ind == 0) insertAtHead(val);  
        else {
            Node temp = head;
            while (ind-- > 1 && temp.next != null) 
                temp = temp.next;
            if(temp == null)
                return;
            Node n = new Node(val);
            n.next = temp.next;
            temp.next = n;
        }
    }

    @Override
    public void removeAtHead() {
        if(head == null) return;
        head = head.next;
    }

    @Override
    public void removeAtLast() {
        if(head == null) return; 
        if(head.next == null) head = null;
        else {
            Node temp = head;
            while(temp.next != null && temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    @Override
    public void removeAtIndex(int ind) {
        if(head == null) return;
        if(ind == 0) removeAtHead();
        else {
            Node temp = head;
            while (ind-- > 1 && temp.next != null) {
                temp = temp.next;
            }
            if(temp == null || temp.next == null) return;
            temp.next = temp.next.next;
        }
    }

    @Override
    public void display() {
        if(head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public void getNodeAtIndex(int ind) {
        if(head == null) return;
        Node temp = head;
        while (ind-- > 0 && temp != null) 
            temp = temp.next;
        if(temp == null) return;
        System.out.println(temp.data);
    }

    public void display(Node head) {
        if(head == null){
            System.out.println("head is null");
            return;
        } 
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}