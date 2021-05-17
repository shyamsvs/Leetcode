//TLE

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[nums.length];
        int ansCount = 0;
        for(int[] i : queries){
            nums[i[1]] += i[0];
            int tempAns = 0;
            for (int k = 0; k < nums.length; k++){
                if(nums[k] % 2 == 0)
                    tempAns += nums[k];
            }
            ans[ansCount++] = tempAns;
        }
        return ans;
    }
}
