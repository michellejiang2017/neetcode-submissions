class Solution {
    // used hints
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) { 
            int difference = target - nums[i];
            if (map.containsKey(difference)) { 
                int[] solution = new int[2];
                solution[0] = (int) map.get(difference);
                solution[1] = i;
                return solution;
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
