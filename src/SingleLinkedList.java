
public class SingleLinkedList {

    public Node head;

    public SingleLinkedList(Node head) {
        this.head = head;
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }

    public void insertAtEnd(int data) {
        Node current = this.head;
        while (true) {
            if (current.next == null) {
                current.next = new Node(data);
                break;
            }

            current = current.getNext();
        }
    }

    public void deleteByValue(int data) {
        Node current = this.head;
        Node prev = null;
        while (true) {
            if (current.getData() == data) {
                if (current.next == null) {
                    prev.next = null;
                } else {
                    current = current.next.getNext();
                }
                break;
            }
            prev = current;
            current = current.getNext();
        }

    }

    public void display() {
        System.out.println("======================= Running Display =======================");
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            System.out.println("->");
            current = current.getNext();
        }
    }
}

