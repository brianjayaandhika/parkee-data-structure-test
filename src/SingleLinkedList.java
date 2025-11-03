
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
        if (this.head.getData() == data) {
            this.head = this.head.next;
            return;
        }

        Node current = this.head;
        Node prev = null;

        while (true) {
            if (current == null) {
                System.out.println("Value not found");
                break;
            }

            if (current.getData() == data) {
                if (current.next == null) {
                    prev.next = null;
                } else {
                    prev.next = current.next;
                }

                break;
            }

            prev = current;
            current = current.next;
        }
    }

    public void display() {
        System.out.println("======================= Running Display =======================");
        Node current = this.head;

        if(current == null){
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.println(current.getData());
            System.out.println("->");
            current = current.getNext();
        }
    }
}

