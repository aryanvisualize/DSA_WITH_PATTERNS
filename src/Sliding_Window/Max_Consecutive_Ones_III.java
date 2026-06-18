//1004. Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] nums, int k) {
        //Sliding window
        int left = 0;
        int sum = 0;
        int ans = 0;

        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            //SubArray that has maximum k zeros
            while(sum + k < right-left+1){      //(right-left+1)-sum > k
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}