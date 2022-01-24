class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int zeroCount = 0;
        long multiply = 1;
        for (int num : nums){
            if (num == 0){
                zeroCount++;
                continue;
            }
            multiply = multiply * num;
        }
        if (zeroCount > 1)return new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                ans[i] = (int) multiply;
            }
            else if(zeroCount == 1){
                ans[i] = 0;
            }
            else {
                ans[i] = (int) (multiply / nums[i]);
            }
        }
        return ans;
    }
}
