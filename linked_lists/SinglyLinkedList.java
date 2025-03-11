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
    
    public static void main(String[] args) {
        System.out.println("Hello There");
    }
}
