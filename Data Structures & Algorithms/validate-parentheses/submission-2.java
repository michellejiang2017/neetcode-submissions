class Solution {
    public boolean isValid(String s) {
        // push and pop 
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) =='(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                // if it's one of the enders, stack.pop() and if it matches the opposite then continue if not then return false
                if (stack.pop() == '{') {
                    continue;
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (i == 0) {
                    return false;
                }
                if (stack.pop() == '[') {
                    continue;
                } else {
                    return false;
                }
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (i == 0) {
                    return false;
                }
                if (stack.pop() == '(') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
