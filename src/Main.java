
public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        SingleLinkedList singleLinkedList = new SingleLinkedList(head);

        singleLinkedList.insertAtEnd(2);
        singleLinkedList.insertAtBeginning(4);
        singleLinkedList.insertAtEnd(3);
        singleLinkedList.insertAtBeginning(5);

        singleLinkedList.insertAtEnd(6);
        singleLinkedList.insertAtEnd(7);
        singleLinkedList.insertAtBeginning(8);
        singleLinkedList.deleteByValue(8); // Delete value at head
        singleLinkedList.deleteByValue(7); // Delete value at end
        singleLinkedList.deleteByValue(4); // Delete value at middle

        singleLinkedList.display();

    }
}
