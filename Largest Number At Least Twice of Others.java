class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
                index = i;
            }
        }
        boolean valid = true;
        for (int num : nums) {
            if ((max < num * 2) && num!=max) {
                valid = false;
                break;
            }
        }
        return valid ? index : -1;
    }
}
