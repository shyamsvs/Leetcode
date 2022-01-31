class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int[] ans = new int[nums.length];
        List<Integer> evenArray = new ArrayList<>();
        List<Integer> oddArray = new ArrayList<>();
        int counter = 0;
        for (int num : nums){
            if (num % 2 == 0){
                evenArray.add(num);
            }
            else {
                oddArray.add(num);
            }
        }
        for (Integer integer : evenArray) {
            ans[counter++] = integer;
        }
        for (Integer integer : oddArray) {
            ans[counter++] = integer;
        }
        return ans;   
    }
}
