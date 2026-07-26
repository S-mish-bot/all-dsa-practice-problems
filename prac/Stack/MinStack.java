package Stack;
import java.util.Stack;
/* Design a stack class that supports the push, pop, top, and getMin operations.

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
Each function should run in 
O
(
1
)
O(1) time. */


//Solution 1 Brute force Time Complexity O(n), Space Complexity O(n)
class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }  
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        else return -1;   
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int min = stack.peek();

        while(!stack.isEmpty()) {
            min = Math.min(min, stack.peek());
            temp.push(stack.pop());
        }

        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return min;
        
    }
}

//Solution 2 (Optimised) Time Complexity O(1), Space Complexity O(1)
class MinStack1 {
    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack1() {
        stack = new Stack<>();
        min = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == min.peek()) {
            min.pop();
        }
        
    }
    
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        else return -1;
    }
    
    public int getMin() {
        return min.peek();
        
    }
}


