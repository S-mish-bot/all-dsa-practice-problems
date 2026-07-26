package Easy;


/*Input: nums = [1,4,1,2]
Output: [1,4,1,2,1,4,1,2]
 You are given an integer array nums of length n. 
Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 */
class Solution {
    public int[] getConcatenation(int[] nums) {
        int newArray[] = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = newArray[i + nums.length] = nums[i];
        }
        return newArray;
    }
}
