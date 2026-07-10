//1047. Remove All Adjacent Duplicates In String

class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new LinkedList<>();
        int n = s.length();
        for(char ch : s.toCharArray()){
            if(st.size() != 0 && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
