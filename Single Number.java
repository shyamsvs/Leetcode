class Solution {
    public int singleNumber(int[] nums) {
         int ans = 0;
        for (int num : nums){
            ans ^= num;
        }
        return ans;
    }
}


class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num,0) + 1);
        }
        for(int num : nums){
            if (hashMap.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}
