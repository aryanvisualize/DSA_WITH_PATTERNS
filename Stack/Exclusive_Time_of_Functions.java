//636. Exclusive Time of Functions

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int prevTime = 0;

        for(String s : logs){
            String[] parts = s.split("\\s*:\\s*");
            int functionId = Integer.parseInt(parts[0]);
            String type = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if(type.equals("start")) {
                if(st.size() != 0){
                    ans[st.peek()] += timestamp - prevTime;
                }
                st.push(functionId);
                prevTime = timestamp;
            }
            else {
                ans[st.peek()] += timestamp - prevTime + 1;
                st.pop();
                prevTime = timestamp + 1;
            }
        }
        return ans;
    }
}