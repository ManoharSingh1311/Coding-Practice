package LinkedList;
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

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node first = new Node(data);
        first.next = head;
        head = first;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position (1-based)
    void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);
        if (position <= 1 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        head = head.next;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at specific position (1-based)
    void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (position <= 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {
            System.out.println("Position exceeds list length. Cannot delete.");
            return;
        }
        temp.next = temp.next.next;
    }

    // Print linked list
    void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListCreation list = new LinkedListCreation();

        // Insert some initial elements
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.print("Current List: ");
        list.printLinkedList();

        // Insert at end
        System.out.println("Inserting 40 at the end...");
        list.insertAtEnd(40);
        list.printLinkedList();

        // Insert at position
        System.out.println("Enter position to insert new element:");
        int pos = sc.nextInt();
        System.out.println("Enter element to insert:");
        int val = sc.nextInt();
        list.insertAtPosition(pos, val);
        System.out.print("List after insertion at position " + pos + ": ");
        list.printLinkedList();

        // Delete at beginning
        System.out.println("Deleting at beginning...");
        list.deleteAtBeginning();
        list.printLinkedList();

        // Delete at end
        System.out.println("Deleting at end...");
        list.deleteAtEnd();
        list.printLinkedList();

        // Delete at specific position
        System.out.println("Enter position to delete element:");
        int delPos = sc.nextInt();
        list.deleteAtPosition(delPos);
        System.out.print("List after deletion at position " + delPos + ": ");
        list.printLinkedList();

        sc.close();
    }
}
