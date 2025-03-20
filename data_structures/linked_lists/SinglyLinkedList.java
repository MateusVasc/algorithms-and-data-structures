package data_structures.linked_lists;

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

    public void pushFront(int val) {
        if (this.size == 0) {
            this.head = new Node(val);
            this.size++;
            return;
        }

        this.head = new Node(val, this.head);
        this.size++;
    }

    public void popBack() {
        if (this.size == 0) {
            return;
        }

        if (this.size == 1) {
            this.head = null;
            this.size--;
            return;
        }

        Node curr = this.head;

        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        this.size--;
    }

    public void popFront() {
        if (this.size == 0) {
            return;
        }

        if (this.size == 1) {
            this.head = null;
            this.size--;
            return;
        }

        this.head = this.head.next;
        this.size--;
    }

    public boolean find(int val) {
        if (this.size == 0) {
            return false;
        }

        Node curr = this.head;

        while (curr != null) {
            if (curr.data == val) {
                return true;
            }
            
            curr = curr.next;
        }

        return false;
    }

    public void printList() {
        if (this.size == 0) {
            System.out.println("NULL");
            return;
        }

        System.out.print("List elements: ");

        Node curr = this.head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    // Java's GC will eventually clean the memory eventually
    public void freeList() {
        if (this.size > 0) {
            this.head = null;
            this.size = 0;
        }
    }

    public void freeListFaster() {
        Node curr = this.head;
    
        while (curr != null) {
            Node temp = curr;
            curr = curr.next;
            temp.next = null;
        }

        this.head = null;
        this.size = 0;
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

        // Adding at the beginning
        list.pushFront(5);
        list.pushFront(3);
        list.pushFront(1);

        // Checking list size after insertions
        System.out.println("Size after insertions: " + list.getSize()); // Expected: 6

        // Removing at the beginning and at the end
        list.popBack();
        list.popFront();

        // Checking list size after removals
        System.out.println("Size after removals: " + list.getSize()); // Expected: 4

        // Checking find
        System.out.println("Found? " + list.find(20)); // Expected: True

        // Checking find
        System.out.println("Found? " + list.find(50)); // Expected: False

        list.printList(); // Expected: 3 -> 5 -> 10 -> 20 -> NULL

        // Removes the list
        // list.freeList(); // NULL
        list.freeListFaster(); // NULL

        list.printList(); // Expected: NULL
    }
}
