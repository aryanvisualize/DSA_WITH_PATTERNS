//409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        //Using HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        int ans = 0;
        Boolean isOddFound = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int key = entry.getValue();
            if(key % 2==0){
                ans += key;
            }
            else{
                ans += (key-1);
                isOddFound = true;
            }
        }
        return isOddFound ? ans+1 : ans;
    }
}