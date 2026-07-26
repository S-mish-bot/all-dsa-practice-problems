/*This question can also be framed as Remove all occurences of an element in place or Remove all duplicates */
package Easy;


//Remove element
class Solution1 {
    public int removeElement(int[] nums, int val) {
        int leftPointer = 0;
        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if (nums[rightPointer] != val) {
                nums[leftPointer++] = nums[rightPointer];
            }
        }
        return leftPointer;
    }
}

//Remove Duplicates(Sorted)
class Solution2 {
    public int removeElement(int[] nums, int val) {
        int leftPointer = 1;
        for (int rightPointer = 1; rightPointer < nums.length; rightPointer++) {
            if (nums[rightPointer] != nums[rightPointer-1]) {
                nums[leftPointer++] = nums[rightPointer];
            }
        }
        return leftPointer;
    }
}
