/* */

package Easy;
import java.util.HashSet;
import java.util.Arrays;


class Solution1 {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i : nums) {
            if (duplicate.add(i))
                continue;
            else return true;
        }
        return false;
    }
}

class Solution2 {
    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return true;
        }
        return false; 
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
