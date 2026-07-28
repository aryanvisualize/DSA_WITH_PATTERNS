//383. Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : ransomNote.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            else if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq-1);
                if(freq==1){
                    map.remove(ch);
                }
            }
        }
        return true;
    }
}
