class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < length - 1; i++) {
            if ((nums[i] ^ nums[i+1]) == 0){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
