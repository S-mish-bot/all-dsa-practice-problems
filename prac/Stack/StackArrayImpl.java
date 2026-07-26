package Stack;

class StackArrayimpl {
    private int[] arr;
    private int capacity;
    private int top;

    public StackArrayimpl(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1;
    }

    //Push Operation
    public void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = val;  
    }

    //Pop Operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    //Top or Peek Operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }


    //check Stack empty
    public boolean isEmpty() {
        return top == -1;
    }

    //check Stack isFull
    public boolean isFull() {
        return top == capacity -1 ;
    }

    public class Main {
        public static void main(String args[]) {
            StackArrayimpl stackArrayimpl = new StackArrayimpl(5);
            stackArrayimpl.push(1);
            stackArrayimpl.push(10);
            stackArrayimpl.push(900);
            stackArrayimpl.push(20);
            stackArrayimpl.push(113);


            System.out.println("Check Full Operation::" + stackArrayimpl.isFull());
            System.out.println("Pop Operation::" + stackArrayimpl.pop());
            System.out.println("Peek Operation::" + stackArrayimpl.peek());
            System.out.println("Pop Operation::" + stackArrayimpl.pop());
            System.out.println("Peek Operation::" + stackArrayimpl.peek());
            System.out.println("Pop Operation::" + stackArrayimpl.pop());
            System.out.println("Pop Operation::" + stackArrayimpl.pop());
            System.out.println("Peek Operation::" + stackArrayimpl.peek());
            System.out.println("Pop Operation::" + stackArrayimpl.peek());
            System.out.println("Check Empty Operation::" + stackArrayimpl.isEmpty());
            System.out.println("Pop Operation::" + stackArrayimpl.pop());
            System.out.println("Pop Operation::" + stackArrayimpl.pop());


        }
    }
    
}
