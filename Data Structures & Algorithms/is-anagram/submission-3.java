class Solution {
    public boolean isAnagram(String s, String t) {
        // convert string to string list 
        // put each letter in the string in a hashset 
        // compare each letter in t to see if it's in the hashset
        // use frequency table
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> set = new HashMap<Character, Integer>(); 
        for (int i = 0; i < s.length(); i++) { 
            if (set.containsKey(s.charAt(i))) {
                int n = set.get(s.charAt(i)) + 1;
                set.put(s.charAt(i), n);
            } else {
                set.put(s.charAt(i), 1);
            }
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int j = 0; j < t.length(); j++) { 
            if (map.containsKey(t.charAt(j))) {
                int m = map.get(t.charAt(j)) + 1;
                map.put(t.charAt(j), m);
            } else {
                map.put(t.charAt(j), 1);
            }
        }
        return set.equals(map);
    }
}