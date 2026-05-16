class Solution {
    public boolean isPalindrome(String s) {
        String words = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0; 
        int right = words.length() - 1; 
        while (left < right) {
            char end = words.charAt(right);
            char start = words.charAt(left);
            right--;
            left++; 
            if (start != end) {
                return false;
            }
        }
        return true; 
    } 
}
