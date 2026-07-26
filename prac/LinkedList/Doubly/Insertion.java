package LinkedList.Doubly;

public class Insertion {
    Insertion next;
    Insertion prev;
    int data;

    Insertion(int data) {
        this.next = null;
        this.prev = null;
        this.data = data;

    }

    public static Insertion insertAtFront(Insertion head, int data) {
        Insertion newNode = new Insertion(data);
        if (head == null) {
            return newNode;
        }
        head.prev = newNode;
        newNode.next = head;

        return newNode;
    }

    public static Insertion insertAtEnd(Insertion head, int data) {
        Insertion newNode = new Insertion(data);
        if (head == null) return newNode;

        Insertion last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;

        return head;
    
    }

    public static Insertion insertAtPos(Insertion head, int pos, int data) {
        Insertion newNode = new Insertion(data);

        if (head == null) return newNode;
        if (pos < 1) return head;
        if (pos == 1) return insertAtFront(head, data);

        Insertion curr = head;
        for (int i = 1; i <= pos - 1 && curr!=null; i++) {
            curr = curr.next;
        }

        if (curr == null) return head;

        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next = newNode;

        if (newNode.next != null) newNode.next.prev = newNode;

        return head;

    }

    public static void traverse(Insertion head) {
        Insertion temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.println("<->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Insertion head = new Insertion(10);
        head.next = new Insertion(20);
        head.next.prev = head;

        head.next.next = new Insertion(30);
        head.next.next.prev = head.next;

        head.next.next.next = new Insertion(40);
        head.next.next.next.prev = head.next.next.next;

        System.out.println("Before Insertion");
        traverse(head);
        System.out.println("After Insertion At Front");
        head = insertAtFront(head, 5);
        traverse(head);
        System.out.println("Insertion At End");
        head = insertAtEnd(head, 50);
        traverse(head);
        System.out.println("Insert at a position");
        head = insertAtPos(head, 4, 35);
        traverse(head);

    }
    
}
