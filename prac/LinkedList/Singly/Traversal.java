package LinkedList.Singly;

// Iterative Implementation (Time Complexity O(n), Space Complexity O(1))
class Node {
    int data;
    Node next;

    Node (int value) {
        this.data = value;
        this.next = null;

    } 
}
public class Traversal {

    public static void traverse(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
            System.out.println();

    }

    public static void main(String args[]) {
        Node head = new Node (10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        traverse(head);


    }

    
}


//Recursion Implementation(Time Complexity O(n), Space Complexity O(n))
// static void recur_traversal(Node head) {
//     if (head == null) {
//         System.out.println();
//         return;
//     }

//     System.out.print(head.data);
//     if (head.next != null) {
//         System.out.print("->");
//     }
//     recur_traversal(head.next);
// }