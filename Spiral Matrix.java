class Solution {
    public List<Integer> spiralOrder(int[][] array) {
        List<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;
        while (startRow <= endRow && startCol <= endCol){
            for (int i = startCol; i <= endCol; i++) {
                ans.add(array[startRow][i]);
            }
            for (int i = startRow+1; i <= endRow; i++) {
                ans.add(array[i][endCol]);
            }
            for (int i = endCol-1; i >=startCol ; i--) {
                if (startRow == endRow)break;
                ans.add(array[endRow][i]);
            }
            for (int i = endRow-1; i > startRow; i--) {
                if (startCol == endCol)break;
                ans.add(array[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return ans;
    }
}
