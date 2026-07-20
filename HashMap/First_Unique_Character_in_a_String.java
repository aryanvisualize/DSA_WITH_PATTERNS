//387. First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        //Brute force
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            } else {
                map.put(ch, 1);
            }
        }

        char c = '\0';

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                c = s.charAt(i);
                break;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                return i;
        }

        return -1;
    }
}