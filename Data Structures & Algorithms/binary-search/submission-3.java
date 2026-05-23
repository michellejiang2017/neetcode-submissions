class Solution {
    public int search(int[] nums, int target) {
        int max = nums.length -1 ;
        int min = 0;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                // search back half
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1; 
    }
}
