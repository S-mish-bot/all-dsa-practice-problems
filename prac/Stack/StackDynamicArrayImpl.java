package Stack;

import java.util.ArrayList;

class MyStack {
    ArrayList<Integer> arr = new ArrayList<>();

    //Push Operation
    public void push(int val) {
        arr.add(val);
    }

    //Pop Operation
    public int pop() {
        if (arr.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val = arr.get(arr.size()-1);
        arr.remove(arr.size() - 1);
        return val;

    }

    //Peek Operation
    public int peek() {
        if (arr.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        return arr.get(arr.size()-1);
    }

    //check Stack isEmpty
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    //check current Stack size

    public int size() {
        return arr.size();
    }

}

public class StackDynamicArrayImpl {
    public static void main(String args[]) {

        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        // popping one element
        System.out.println("Popped: " + myStack.pop());

        // checking top element
        System.out.println("Top element: " + myStack.peek());

        // checking if stack is empty
        System.out.println("Is stack empty: " + 
                            (myStack.isEmpty() ? "Yes" : "No"));

        // checking current size
        System.out.println("Current size: " + myStack.size());
    }
    
}
