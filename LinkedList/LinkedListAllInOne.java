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

class LinkedList {
    Node head;

    // Insertion
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

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

    // Deletion
    void deleteAtBeginning() {
        if (head != null) head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void deleteAtPosition(int position) {
        if (head == null || position <= 1) {
            head = head != null ? head.next : null;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next != null) temp.next = temp.next.next;
    }

    // Search
    int search(int key) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == key) return pos;
            temp = temp.next;
            pos++;
        }
        return -1;
    }

    // Length
    int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Reverse
    void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    // Print
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListAllInOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtPosition(2, 25);
        System.out.print("List after insertions: ");
        list.printList();

        System.out.println("Length: " + list.length());

        int searchVal = 25;
        System.out.println(searchVal + " found at position: " + list.search(searchVal));

        list.reverse();
        System.out.print("Reversed list: ");
        list.printList();

        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(2);
        System.out.print("List after deletions: ");
        list.printList();

        sc.close();
    }
}
