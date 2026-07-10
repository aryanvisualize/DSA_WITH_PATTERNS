//20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (st.size() != 0 && st.peek() == '(' && ch == ')') {
                st.pop();
            } else if (st.size() != 0 && st.peek() == '{' && ch == '}') {
                st.pop();
            } else if (st.size() != 0 && st.peek() == '[' && ch == ']') {
                st.pop();
            } else {
                st.push(ch);
            }

        }
        return st.size() == 0;
    }
}
