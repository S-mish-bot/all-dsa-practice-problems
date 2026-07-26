package LinkedList.Doubly;

public class Traversal {
    int data;
    Traversal next;
    Traversal prev;

    Traversal (int data) {
        this.data = data;
        next = prev = null;
    }

    public static void traverse(Traversal head) {
        Traversal temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.println("<->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Traversal head = new Traversal(10);
        head.next = new Traversal(20);
        head.next.prev = head;

        head.next.next = new Traversal(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Traversal(40);
        head.next.next.next.prev = head.next.next;

        traverse(head);

    }
    
}
