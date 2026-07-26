package LinkedList.Medium;

/* Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
Example 1:

Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]
 */

//Solution O(n)
class MyLinkedList {
    private static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int currSize = 0;

    public MyLinkedList() {}
    
    public int get(int index) {
        if (index < 0 || index >= currSize) return -1;

        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) return -1;

        return temp.data;

        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (currSize == 0) tail = head;
        currSize++;
    }
    
    public void addAtTail(int val) {
        if (currSize == 0) addAtHead(val);
        else {
            tail.next = new Node(val);
            tail = tail.next;
            currSize++;
        }
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > currSize) return;
        else if (index == currSize) addAtTail(val);
        else if (index == 0) addAtHead(val);
        else {
            Node newNode = new Node(val);

            Node temp = head;
            for (int i = 0; i < index-1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) return;

            newNode.next = temp.next;
            temp.next = newNode;
            currSize++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= currSize) return;

        //Case 1: Delete Head
        if (index == 0) {
            head = head.next;
            if (currSize == 1) tail = null;
            currSize--;
            return;
        }
        //traverse to node before index
        Node temp = head;
        for (int i = 0; i < index-1 && temp != null; i++) {
            temp = temp.next;
        }
        //if deleting last node, update tail
        if (temp.next == tail) tail = temp;

        temp.next = temp.next.next;
        currSize--;

        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */