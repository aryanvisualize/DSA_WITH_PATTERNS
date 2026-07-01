//1358. Number of Substrings Containing All Three Characters


class Solution {
    public int numberOfSubstrings(String s) {
        //Using sliding window with HashMap
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        int i=0;
        int ans = 0;

        for(int j=0; j<n; j++){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch,freq+1);
            } else map.put(ch,1);
            while(map.size()==3){
                ans += (n-j);

                char left = s.charAt(i);
                if(map.get(left)==1){
                    map.remove(left);
                }
                else if(map.containsKey(left)){
                    int freq = map.get(left);
                    map.put(left, freq-1);
                }
                i++;
            }

        }
        return ans;


        // //Using sliding window
        // int n = s.length();
        // int[] arr = new int[3];
        // int res = 0;
        // int i=0, j=0;
        // while(j<n){
        //     char ch = s.charAt(j);
        //     arr[ch-'a']++;
        //     while(arr[0]>0 && arr[1]>0 && arr[2]>0){
        //         res += (n-j);
        //         arr[s.charAt(i) -'a']--;
        //         i++;
        //     }
        //     j++;
        // }
        // return res;



        // //Brute force -> TLE (O(n^2))

        // int n = s.length();
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     String str = "";
        //     boolean hasA = false, hasB = false, hasC = false;
        //     for(int j=i; j<n; j++){
        //         char ch = s.charAt(j);
        //         if(ch=='a') hasA= true;
        //         else if(ch == 'b') hasB = true;
        //         else if(ch == 'c') hasC = true;

        //         if(hasA && hasB && hasC) count++;
        //     }
        // }
        // return count;
    }
}