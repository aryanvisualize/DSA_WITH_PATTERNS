//918. Maximum Sum Circular Subarray

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //kadanes Algo
        int n = nums.length;
        int maxEnding = nums[0];
        int ans1 = nums[0];
        //Maximum Subarray
        for(int i=1; i<n; i++){
            int v1 = nums[i];
            int v2 = nums[i] + maxEnding;
            maxEnding = Math.max(v1,v2);
            ans1 = Math.max(ans1,maxEnding);
        }

        //Minimum Subarray
        int minEnding = nums[0];
        int ans2 = nums[0];
        int total = nums[0];
        for(int i=1; i<n; i++){
            int v3 = nums[i];
            int v4 = nums[i] + minEnding;
            minEnding = Math.min(v3,v4);
            ans2 = Math.min(ans2, minEnding);
            total += nums[i];
        }
        if(ans1 < 0) return ans1;
        return Math.max(ans1, total-ans2);  //Take Math.max(max , remove minimum from total)
    }
}