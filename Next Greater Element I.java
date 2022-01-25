class Solution {
    static int helper(int[] nums, int index){
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] > nums[index] ){
                return nums[i];
            }
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    ans[i] = helper(nums2, j);
                }
            }
        }
        return ans;
    }
}
