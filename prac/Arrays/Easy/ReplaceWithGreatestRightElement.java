package Easy;

//Solution 1 - Brute Force Time Complexity - O(n^2), Space Complexity - O(1)
class Solution1 {
    public int[] replaceElements(int[] arr) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}

//Solution 2 - Optimised Time Complexity - O(n), Space Complexity - O(n)
class Solution2 {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max = -1;
        for (int i = arr.length - 1 ; i >= 0; i--) {
            ans[i] = max;
            max = Math.max(max, arr[i]);
        }
        return ans;
        
    }
}
