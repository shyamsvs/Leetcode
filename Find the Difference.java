class Solution {
    public char findTheDifference(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        char ans = '*';
        if(t.length() == 1) return t.charAt(0);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                ans = b[i];
                break;
            }
        }
        if (ans == '*')ans = b[t.length() - 1];
        return ans;
    }
}
