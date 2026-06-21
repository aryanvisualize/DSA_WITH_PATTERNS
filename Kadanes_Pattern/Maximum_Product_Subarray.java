//152. Maximum Product Subarray

class Solution {
    public int maxProduct(int[] nums) {
        //Kadane's Algo
        int n = nums.length;
        int ans = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];

        for(int i=1; i<n; i++){
            int v1 = nums[i];
            int v2 = nums[i]*minEnding;
            int v3 = nums[i]*maxEnding;

            maxEnding = Math.max(v1,Math.max(v2,v3));
            minEnding = Math.min(v1,Math.min(v2,v3));
            ans = Math.max(ans, Math.max(maxEnding, minEnding));
        }
        return ans;


        // //Kadane's Algo
        // int n = nums.length;
        // int bestEnding = 1;     //Find the best ending for each i
        // int ans = nums[0];
        // for(int i=0; i<n; i++){
        //     int v1 = bestEnding * nums[i];
        //     int v2 = nums[i];
        //     bestEnding = Math.max(v1, v2);    //Fails at [-2,3,-4] = 24 where my sol gives 3
        //     ans = Math.max(ans, bestEnding);
        // }
        // return ans;
    }
}