import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> distinctNumbers = new HashSet<>();
        for (int num : nums){
            distinctNumbers.add(num);
        }
        List<Integer> sorted = new ArrayList<>(distinctNumbers);
        sorted.sort(Collections.reverseOrder());
        if(sorted.size() == 1 || sorted.size() == 2)return sorted.get(0);
        if(sorted.size() > 2)return sorted.get(2);
        return 0;
    }
}
