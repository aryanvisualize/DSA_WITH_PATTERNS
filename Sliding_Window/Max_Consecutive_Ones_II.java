//Max Consecutive Ones II

class Solution{
    public int findMaxConsecutiveOnes(int[] nums){
        int left = 0;
        int ans = 0;
        int sum = 0;

        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            //0 zero || 1 zero
            while(!(right-left+1 == sum || right-left == sum)){     //more than 1 zeros
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}