package Easy;

//Solution1 - Brute Force
class Solution1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, res = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) break;
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
        
    }
}

class Solution2 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int res = 0, count = 0;
        for (int num : nums) {
            if (num == 0) {
                res = Math.max(res, count);
                count = 0;
            }
            else count ++;
        }
        return Math.max(res, count);
        
    }
}

class Solution3 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > res){
                    res = count;
                }
            } else {
                count = 0;
            }
        }
        return res;
        
    }
}
//Most optimised in terms of runtime and space
class Solution4 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, count = 0;
        for (int num : nums) {
            count = (num == 1) ? count + 1 : 0;
            res = Math.max(res, count);
        }
        return res;
    }
}
