package Queue;

public class QueueArrayImpl {
    private int[] arr;
    private int size;
    private int capacity;

    public QueueArrayImpl(int cap) {
        this.capacity = cap;
        arr = new int[capacity];
        size = 0;
    }

    public void enqueue(int val) {
        if (size == capacity) {
            System.out.println("Queue Overflow!");
            return;
        }
        arr[size++] = val;
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    public int getFront() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[size-1];
    }

    public static void main(String args[]) {
        QueueArrayImpl queueArrayImpl = new QueueArrayImpl(5);
        queueArrayImpl.enqueue(10);
        queueArrayImpl.enqueue(20);
        queueArrayImpl.enqueue(30);
        queueArrayImpl.enqueue(40);

        System.out.println("Peek?" + queueArrayImpl.getFront());
        System.out.println("Current Rear Value?" + queueArrayImpl.getRear());
        System.out.println("Delete one element");
        queueArrayImpl.dequeue();

        System.out.println("Peek?" + queueArrayImpl.getFront());
        System.out.println("Current Rear Value?" + queueArrayImpl.getRear());

        queueArrayImpl.enqueue(50);
        queueArrayImpl.enqueue(60); 
        
        System.out.println("Peek?" + queueArrayImpl.getFront());
        System.out.println("Current Rear Value?" + queueArrayImpl.getRear());

        queueArrayImpl.enqueue(70); 


    }
}
