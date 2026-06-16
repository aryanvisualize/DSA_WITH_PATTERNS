//904. Fruit Into Baskets

class Solution {
    public int totalFruit(int[] fruits) {
        //Optimal Approach -> using Hashmap
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int max = 0;

        while(j<n){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            if(map.size() <= 2){
                max = Math.max(max,j-i+1);
            }

            else{       //Shrinking phase
                int freq = map.get(fruits[i]);
                if(freq==1) map.remove(fruits[i]);
                else map.put(fruits[i],freq-1);
                i++;
            }
            j++;
        }
        return max;

        // //Brute force --> Using Hashset O(n^2) TLE
        // int n = fruits.length;
        // int max = 0;

        // for(int i=0; i<n; i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     int count = 0;
        //     for(int j=i; j<n; j++){
        //         set.add(fruits[j]);
        //         if(set.size()>2) break;
        //         count++;
        //     }
        //     max = Math.max(count, max);
        // }
        // return max;
    }
}