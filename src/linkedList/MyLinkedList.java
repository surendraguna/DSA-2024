package linkedList;

public interface MyLinkedList {
    void insertAtHead(int value);
    void insertAtEnd(int value);
    void insertAtIndex(int index, int value);
    void removeAtHead();
    void removeAtLast();
    void removeAtIndex(int index);
    void display();
    void getNodeAtIndex(int index);
}
