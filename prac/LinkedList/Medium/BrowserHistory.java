/* You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.

Implement the BrowserHistory class:

BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
void visit(string url) Visits url from the current page. It clears up all the forward history.
string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 

Example:

Input:
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output:
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
 */


package LinkedList.Medium;

//solution 1
class BrowserHistory {
    class Node {
        Node prev;
        Node next;
        String url;
        public Node(String url) {
            this.url = url;
            prev = next = null;
        }
    }

    Node curr;

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;   
    }
    
    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.url;
    }
    
    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

//solution 2
class BrowserHistory1 {
    String[] h;
    int l, c = 0;

    public BrowserHistory1(String homepage) {
        h = new String[5000];
        h[0] = homepage;
    }

    public void visit(String url) {
        h[++c] = url;
        l = c;
    }

    public String back(int steps) {
        c = Math.max(0, c - steps);
        return h[c];
    }

    public String forward(int steps) {
        c = Math.min(l, c + steps);
        return h[c];
    }
}
