package LinkedList.Singly;

public class ReverseLinkedList {
    int val;
    ReverseLinkedList next;

    public ReverseLinkedList(int val) {
        this.val = val;
        this.next = null;
    }

    //Uisng recursion (Time Complexity O(n), Space Complexity O(n))
    public static ReverseLinkedList reverseList(ReverseLinkedList head) {
        if (head == null) return null;

        ReverseLinkedList newHead = head;

        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
    }

    public static void traverse(ReverseLinkedList head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print("->");
            }
            head = head.next;
        }
            System.out.println();

    }

    public static void main(String args[]) {
        ReverseLinkedList head = new ReverseLinkedList (10);
        head.next = new ReverseLinkedList(20);
        head.next.next = new ReverseLinkedList(30);
        head.next.next.next = new ReverseLinkedList(40);
        head.next.next.next.next = new ReverseLinkedList(50);

        traverse(head);

        System.out.println("Lust After reversing");

        traverse(reverseList(head));
    }

    
}
