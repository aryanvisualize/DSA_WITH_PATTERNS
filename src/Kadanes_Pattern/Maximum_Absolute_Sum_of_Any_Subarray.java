//1749. Maximum Absolute Sum of Any Subarray

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        //Kadanes Algo
        int n = nums.length;
        int posEnding = nums[0];
        int negEnding = nums[0];
        int ans = Math.abs(nums[0]);    //Has to be abs if nums = [-1]

        for(int i=1; i<n; i++){
            int v1 = nums[i];
            int v2 = nums[i] + negEnding;
            int v3 = nums[i] + posEnding;
            negEnding = Math.min(v1, v2);
            posEnding = Math.max(v1, v3);
            ans = Math.max(ans, Math.max(Math.abs(posEnding), Math.abs(negEnding)));
        }
        return ans;

        // int negEnding = negSum(nums);   //Lowest num (Most negative number)
        // int posEnding = posSum(nums);   //Highest num (Most positive number)
        // int res = Math.max(Math.abs(negEnding), Math.abs(posEnding));   //Takes abs of both and returns which ever is greater.
        // return res;
    }

    // private int negSum(int[] nums) {
    //     int bestEnding = nums[0];
    //     int ans = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         int v1 = nums[i];
    //         int v2 = nums[i] + bestEnding;
    //         bestEnding = Math.min(v1, v2);
    //         ans = Math.min(ans, bestEnding);
    //     }
    //     return ans;
    // }

    // private int posSum(int[] nums) {
    //     int bestEnding = nums[0];
    //     int ans = nums[0];
    //     for (int i = 1; i < nums.length; i++) {
    //         int v1 = nums[i];
    //         int v2 = nums[i] + bestEnding;
    //         bestEnding = Math.max(v1, v2);
    //         ans = Math.max(ans, bestEnding);
    //     }
    //     return ans;
    // }
}