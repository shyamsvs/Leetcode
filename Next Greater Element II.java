class Solution {
    static int helper(int[] nums, int startIndex){
        int target = nums[startIndex];
        startIndex++;
        int toIterate = nums.length - 1;
        for (int i = 0; i < toIterate; i++) {
            if (startIndex > nums.length - 1){
                startIndex = 0;
            }
            if(nums[startIndex] > target){
                return nums[startIndex];
            }
            startIndex++;
        }
        return -1;
    }

    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int ansCounter = 0;
        int mainIndexIterator = 0;
        while (mainIndexIterator < nums.length){
            ans[ansCounter] =  helper(nums, mainIndexIterator);
            ansCounter++;
            mainIndexIterator++;
        }
        return ans;
    }
}
