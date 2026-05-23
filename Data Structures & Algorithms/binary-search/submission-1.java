class Solution {
    public int search(int[] nums, int target) {
        int mid = (int) Math.floor(nums.length / 2);
        int max = nums.length -1 ;
        int min = 0;
        while (min <= max) {
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                // search back half
                min = mid + 1;
                mid = (int) min + (max - min)/2;
                System.out.println(mid);
            } else {
                max = mid - 1;
                mid = (int) max / 2;
                System.out.println(mid);
            }
        }
        return -1; 
    }
}
