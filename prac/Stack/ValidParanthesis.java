package Stack;

import java.util.Stack;
import java.util.HashMap;


//Solution 1 (Using String. Time Complexity O(n^2), Space Complexity O(n))
public class ValidParanthesis {

    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }  


//Solution 2 - (Using stack) Optimized Solution. Time Complexity O(n), Space Complexity
public boolean isValidparanthesis(String s) {
    Stack<Character> paranthesis = new Stack<>();
    HashMap<Character, Character> map = new HashMap<>();

    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    for (char str : s.toCharArray()) {
        if (map.containsKey(str)) {
            if (!paranthesis.isEmpty() && paranthesis.peek() == map.get(str)) {
                paranthesis.pop();
            }
            else return false;
        } else paranthesis.push(str);
    } 
    return paranthesis.isEmpty();
    }
}

