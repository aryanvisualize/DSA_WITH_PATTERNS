//53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        //Kadanes pattern
        int n = nums.length;
        int bestEnding = 0; //Find the best ending for each i
        int ans = nums[0];
        for(int i=0;i<n;i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];
            bestEnding = Math.max(v1,v2);
            ans = Math.max(ans, bestEnding);
        }
        return ans;
    }
}