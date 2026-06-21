class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Two Pointers
        int n = nums.length;
        int i=0, j=n-1;
        while(i<n){
            if((nums[i] + nums[j])> target) j--;
            else if(nums[i] + nums[j] < target) i++;
            else return new int[]{i+1,j+1};
        }
        return new int[]{-1,-1};
    }
}