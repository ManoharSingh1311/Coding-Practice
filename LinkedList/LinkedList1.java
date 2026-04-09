import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class LinkedListCreation {

    // Insert at beginning
    Node insertAtBeginning(Node head, int data) {
        Node first = new Node(data);
        first.next = head;
        head = first;
        return head;
    }

    // Insert at a specific position (1-based index)
    Node insertAtPosition(Node head, int position, int data) {
        Node newNode = new Node(data);

        // If position is 1, insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node temp = head;
        int count = 1;

        // Traverse to the node just before the position
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position is beyond the length of the list. Inserting at end.");
            temp = head;
            if (temp == null) { // list is empty
                head = newNode;
            } else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            return head;
        }

        // Insert newNode
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Print linked list
    void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListCreation list = new LinkedListCreation();
        Node head = null;

        // Insert elements at beginning
        head = list.insertAtBeginning(head, 10);
        head = list.insertAtBeginning(head, 20);
        head = list.insertAtBeginning(head, 30);

        // Print current list
        System.out.print("Current list: ");
        list.printLinkedList(head);

        // Insert at a specific position
        System.out.println("Enter the position where you want to insert the element:");
        int position = sc.nextInt();

        System.out.println("Enter the element to insert:");
        int data = sc.nextInt();

        head = list.insertAtPosition(head, position, data);

        // Print updated list
        System.out.print("Updated list: ");
        list.printLinkedList(head);

        sc.close();
    }
}
