class Solution {
    public int heightChecker(int[] heights) {
        int[] correctOrder = new int[heights.length];
        System.arraycopy(heights, 0, correctOrder, 0, heights.length);
        Arrays.sort(correctOrder);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != correctOrder[i]){
                count++;
            }
        }
        return count;
    }
}
