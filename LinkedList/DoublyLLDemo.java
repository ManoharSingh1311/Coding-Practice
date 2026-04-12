package  LinkedList;

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {

    DNode head;

    // Insert at Beginning
    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }

        head = newNode;
    }

    // Insert at End
    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Forward Traversal
    void printForward() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //Delete at Beginning
    void deleteAtBeginning() {
        if (head == null) return;

        // If only one node
        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }
    //Delete at End
    void deleteAtEnd() {
        if (head == null) return;

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        DNode temp = head;

        // Reach last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }
    // Backward Traversal
    void printBackward() {
        if (head == null) return;

        DNode temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backwards
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    //Reverse a DoublyLinkedList
    void reverse() 
    {
        DNode temp = null;
        DNode current = head;

        while (current != null) {

            // Swap prev and next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node (which is prev now)
            current = current.prev;
        }

        // Fix head
        if (temp != null) {
            head = temp.prev;
        }
    }
}

public class DoublyLLDemo {
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

        System.out.print("Forward: ");
        dll.printForward();

        System.out.print("Backward: ");
        dll.printBackward();
    }
}