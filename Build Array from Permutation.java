class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
	for(int i = 0; i < nums.length; i++)
		ans[i] = nums[nums[i]];
	return ans;
    }
}

class Solution {
    public int[] buildArray(int[] nums) {
        int mask = 1023; 
	for(int i = 0; i < nums.length; i++)
		nums[i] |= (nums[nums[i]] & mask) << 10;
	for(int i = 0; i < nums.length; i++)
		nums[i] = nums[i] >> 10;
	return nums;
    }
}
