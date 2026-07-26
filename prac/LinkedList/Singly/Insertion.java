package LinkedList.Singly;

class Node {
    int data;
    Node next;

    Node (int value ) {
        data = value;
        next = null;
    }
}

public class Insertion {

//Time complexity O(1), Space Complexity O(1)
    static Node insertAtFront(Node head, int newVal) {
        Node newNode = new Node(newVal);
        newNode.next = head;
        head = newNode;
        return newNode;
    }

//Time Complexity O(n), Space Complexity O(1)
    static Node insertAtLast(Node head, int newVal) {
        Node newNode = new Node(newVal);

        if (head == null) {
            return newNode;
        }

        Node last = head;   

        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;

        return head;
    }

//Time Complexity O(n), Space Complexity O(1)
    static Node insertAtPosition(Node head, int pos, int newVal) {
        if (pos < 1) {
            return head;
        }

        if (pos == 1) {
            Node newNode = new Node(newVal);
            newNode.next = head;
            return newNode;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            //here you can also throw and exception since the position given is out of bounds
            //throw new IndexOutOfBoundsException("Position out of bounds");
            return head;
        }

        Node newNode = new Node(newVal);
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }
        public static void main(String[] args) {
        // Create the linked list 2->3->4->5
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        // Insert a new node at the 
        // front of the list
        printList(head);
        int x = 1;
        head = insertAtFront(head, x);
        head = insertAtLast(head, 6);
        head = insertAtPosition(head, 2, 10);

        printList(head);
    }
    
}
