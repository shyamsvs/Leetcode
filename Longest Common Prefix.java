class Solution {
    public String longestCommonPrefix(String[] s) {
        int maxLengthToTraverse = Integer.MAX_VALUE;
        for (String s1 : s){
            maxLengthToTraverse = Math.min(maxLengthToTraverse, s1.length());
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < maxLengthToTraverse; i++) {
            char toCheck = s[0].charAt(i);
            boolean allEqual = true;
            for (String s1 : s){
                if (s1.charAt(i) != toCheck){
                    allEqual = false;
                    break;
                }
            }
            if (allEqual){
                ans.append(s[0].charAt(i));
            }
            else {
                break;
            }
        }
        return ans.toString();
    }
}
