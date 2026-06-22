//560. Subarray Sum Equals K

class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap();
        map.put(0,1);

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                res += map.get(sum -k);
            }

            if(map.containsKey(sum)){
                int freq = map.get(sum);
                map.put(sum, freq+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return res;

        // //Brute force --> O(n^2)
        // int n = nums.length;

        // int count = 0;
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}