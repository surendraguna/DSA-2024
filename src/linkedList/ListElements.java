package linkedList;

public class ListElements extends SingleLL{
    public Node oddElements() {
        SingleLL list = new SingleLL();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        return list.getHead();
    }

    public Node evenElements(){
        SingleLL list = new SingleLL();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        return list.getHead();
    }
}
