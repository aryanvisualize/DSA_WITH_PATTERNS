// 2124. Check if All A's Appears Before All B's

class Solution {
    public boolean checkString(String s) {
        boolean seenB = false;
        for (char ch : s.toCharArray()) {
            if (ch == 'b') {
                seenB = true;
            } 
            else if (seenB) {
                return false;
            }
        }

        return true;

        // //Using Stack
        // Deque<Character> st = new ArrayDeque<>();
        // for(char ch : s.toCharArray()){
        //     if(!st.isEmpty() && ch == 'a' && st.peek() == 'b'){
        //         return false;
        //     }
        //     else{
        //         st.push(ch);
        //     }
        // }
        // return true;
    }
}
