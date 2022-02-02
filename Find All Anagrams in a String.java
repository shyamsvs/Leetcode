import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] baseCounter = new int[26];
        for (int i = 0; i < p.length(); i++) {
            baseCounter[p.charAt(i) - 'a'] +=  1;
        }
        int sLength = 0;
        while (sLength <= (s.length() - p.length())){
            int[] frequencyArray = baseCounter.clone();
            boolean hasAnagram = true;
            for (int i = sLength, j = 0; j < p.length() ; i++, j++) {
                int character = s.charAt(i) - 'a';
                if (frequencyArray[character] > 0){
                    frequencyArray[character] -= 1;
                }
                else {
                    hasAnagram = false;
                    break;
                }
            }
            if (hasAnagram){
                ans.add(sLength);
            }
            sLength++;
        }
        return ans;
    }
}
