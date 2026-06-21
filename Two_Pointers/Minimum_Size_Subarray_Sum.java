//209. Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Variable length sliding window
        int n = nums.length;
        int low =0, high =0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        while(high < n){
            sum += nums[high];
            while(sum >= target){
                int length = high-low+1;
                min = Math.min(min,length);
                sum = sum-nums[low];
                low++;
            }
            high++;
        }
        return min== Integer.MAX_VALUE ? 0 : min;
    }
}