class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while ( left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < target){
                    left++;
                }
                else {
                    right--;
                }
                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result = sum;
                }
            }
        }
        return result;
    }
}
