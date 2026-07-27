package Queue;

public class CircularQueueArrayImpl {
    private int[] arr;
    private int capacity;
    private int size;
    private int front;

    public CircularQueueArrayImpl(int cap) {
        this.capacity = cap;
        arr = new int[capacity];
        front = 0;
        size = 0;
    }

    public void enqueue(int val) {
        if (size == capacity) {
            System.out.println("Queue is Full!");
            return;
        }
        int rear = (front + size) % capacity;
        arr[rear] = val;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int res = arr[front];
        front = (front + 1) % capacity;
        size --;
        return res;
    }

    public int getFront() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        return arr[front];
    }

    public int getRear() {
         if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        int rear = (front + size - 1) % capacity;
        return arr[rear];
    }

    public static void main(String args[]) {
        CircularQueueArrayImpl circularQueueArrayImpl = new CircularQueueArrayImpl(5);
        circularQueueArrayImpl.enqueue(10);
        circularQueueArrayImpl.enqueue(20);
        circularQueueArrayImpl.enqueue(30);
        circularQueueArrayImpl.enqueue(40);
        circularQueueArrayImpl.enqueue(50);

        System.out.println("Delete one element" + circularQueueArrayImpl.dequeue());
        System.out.println("Peek?" + circularQueueArrayImpl.getFront());
        System.out.println("Rear?" + circularQueueArrayImpl.getRear());

        System.out.println("Insert again");
        circularQueueArrayImpl.enqueue(60);
        System.out.println("Peek?" + circularQueueArrayImpl.getFront());
        System.out.println("Rear?" + circularQueueArrayImpl.getRear());
        System.out.println("Insert again");
        circularQueueArrayImpl.enqueue(70);
    }
}