package linked_lists;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public SinglyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public SinglyLinkedList createList() {
        return new SinglyLinkedList();
    }

    public void pushBack(int val) {
        if (this.size == 0) {
            this.head = new Node(val);
            this.size++;
            return;
        }

        Node curr = this.head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new Node(val);
        this.size++;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Testing SinglyLinkedList ===");
    
        // Creating the list
        SinglyLinkedList list = new SinglyLinkedList();
    
        // Test: Empty list
        System.out.println("Initial size: " + list.getSize()); // Expected: 0
    
        // Adding elements
        list.pushBack(10);
        list.pushBack(20);
        list.pushBack(30);
    
        // Checking list size after insertions
        System.out.println("Size after insertions: " + list.getSize()); // Expected: 3
    
        // Traversing and printing the list
        System.out.print("List elements: ");
        Node curr = list.getHead();
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL"); // Expected: 10 -> 20 -> 30 -> NULL
    }
}
