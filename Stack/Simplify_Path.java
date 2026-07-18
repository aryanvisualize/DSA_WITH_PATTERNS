//71. Simplify Path

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            if (part.equals("") || part.equals(".")) {
                continue;
            }

            else if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else {
                st.push(part);
            }
        }

        String ans = "";
        for (String dir : st) {
            ans += "/" + dir;
        }
        return ans.length() == 0 ? "/" : ans;




        // //Brute force
        // Stack<String> st = new Stack<>();
        // String[] parts = path.split("/");

        // for (String part : parts) {
        //     if (!part.isEmpty()) {
        //         st.push(part);
        //     }
        // }
        // ArrayList<String> arr = new ArrayList<>();

        // while (st.size() != 0) {
        //     if (st.peek().equals("..")) {
        //         st.pop();
        //         int count = 1;
        //         while (st.size() != 0 && count > 0) {
        //             if (st.peek().equals("..")) {
        //                 st.pop();
        //                 count++;
        //             } else if (st.peek().equals(".")) {
        //                 st.pop();
        //             } else {
        //                 st.pop();
        //                 count--;
        //             }
        //         }
        //     }

        //     else if (st.peek().equals(".")) {
        //         st.pop();
        //     }
        //     else {
        //         String s = "/";
        //         s += st.pop();
        //         arr.add(s);
        //     }
        // }
        // Collections.reverse(arr);
        // String ans = "";
        // for (String str : arr) {
        //     ans += str;
        // }
        // return ans.length() == 0 ? "/" : ans;
    }
}