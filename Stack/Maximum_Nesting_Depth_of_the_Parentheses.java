//1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int max = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                count++;
                max = Math.max(max, count);
            }
            else if(ch == ')'){
                count--;
            }
        }
        return max;
    }
}