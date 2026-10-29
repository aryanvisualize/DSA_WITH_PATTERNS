// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Sliding Window
        HashSet<Character> window = new HashSet<>();
        int n = s.length();
        int left = 0;
        int ans =0;

        for(int right =0; right < n; right++){
            char current = s.charAt(right);

            while(window.contains(current)){    //Shrinking
                window.remove(s.charAt(left));
                left++;
            }
            window.add(current);
            ans = Math.max(ans, right-left+1);  
        }
        return ans;
    }
}
