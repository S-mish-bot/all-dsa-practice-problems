package Stack;

import java.util.ArrayList;

/*You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

Given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x: Record a new score of x.
'+': Record a new score that is the sum of the previous two scores.
'D': Record a new score that is the double of the previous score.
'C': Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

Note: The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

Example 1:

Input: ops = ["1","2","+","C","5","D"]
 */
//Solution: TimeComplexity O(n), Space Complexity O(n)
class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> scores = new ArrayList<>();
        for (String ops : operations) {
            switch(ops) {
            case "+":
                scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
                break;
            case "D":
                scores.add(scores.get(scores.size()-1) * 2);
                break;
            case "C":
                scores.remove(scores.size()-1);
                break;
            default:
                scores.add(Integer.parseInt(ops));

            }
        }
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}


