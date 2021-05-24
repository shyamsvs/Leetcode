class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        int index = 0;
        for (int num : nums){
            ans[index++] = sum + num;
            sum += num;
        }
        return ans;
    }
}
