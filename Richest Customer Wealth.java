class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                wealth = wealth + account[j];
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}
