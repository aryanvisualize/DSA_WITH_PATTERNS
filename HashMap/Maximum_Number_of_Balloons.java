//1189. Maximum Number of Balloons

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        // for(char ch : text.toCharArray()) {
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // int b = map.getOrDefault('b', 0);
        // int a = map.getOrDefault('a', 0);
        // int l = map.getOrDefault('l', 0) / 2;
        // int o = map.getOrDefault('o', 0) / 2;
        // int n = map.getOrDefault('n', 0);

        // return Math.min(
        //         Math.min(b, a),
        //         Math.min(Math.min(l, o), n)
        // );


        //Optimal
        int[] count = new int[26];

        for(char ch : text.toCharArray()) {
            count[ch - 'a']++;
        }

        return Math.min(
                Math.min(count['b' - 'a'], count['a' - 'a']),
                Math.min(
                        Math.min(count['l' - 'a'] / 2,
                                count['o' - 'a'] / 2),
                        count['n' - 'a']
                )
        );



        // //Brute force
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char ch : text.toCharArray()){
        //     if(map.containsKey(ch)){
        //         int freq = map.get(ch);
        //         map.put(ch, freq+1);
        //     } else{
        //         map.put(ch,1);
        //     }
        // }
        // String s = "balloon";
        // int count = 0;
        // while(true){
        //     for(char ch : s.toCharArray()){
        //         if(!map.containsKey(ch) || map.get(ch)==0){
        //             return count;
        //         }
        //     }

        //     for(char ch : s.toCharArray()){
        //         map.put(ch, map.get(ch)-1);
        //     }
        //     count++;
        // }
    }
}