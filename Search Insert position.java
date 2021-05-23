public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target){
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsertBinary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target)return mid;
            if(nums[mid] > target){
                right = mid -1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        int ans1 = searchInsertPosition.searchInsert(nums, target);
        int ans = searchInsertPosition.searchInsertBinary(nums, target);
        System.out.println(ans1);
        System.out.println(ans);
    }
}
