package stack;

import linkedList.SingleLL;

public class StackExample extends SingleLL{
    public static void main(String[] args) {
        StackExample s = new StackExample();
        s.insertAtHead(1);
        s.insertAtHead(2);
        s.insertAtHead(3);
        s.removeAtHead();
        s.display();
    }
}
