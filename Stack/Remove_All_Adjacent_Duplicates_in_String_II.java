//1209. Remove All Adjacent Duplicates in String II

class Solution {
    class Pair {
        char ch;
        int count;
        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek().ch ==ch){
                st.peek().count++;
                if (st.peek().count == k) {
                    st.pop();
                }
            }
            else{
                st.push(new Pair(ch, 1));
            }
        }
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++) {
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }
}