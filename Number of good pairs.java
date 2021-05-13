class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int ans = 0;
        for (int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num,0) + 1);
            hashSet.add(num);
        }
        for (int num : hashSet){
            if(hashMap.get(num) != 1){
                int n = hashMap.get(num);
                ans += n * (n - 1)/2;
            }
        }
        return ans;
    }
}
