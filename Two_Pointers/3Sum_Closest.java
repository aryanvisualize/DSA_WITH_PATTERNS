class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int resSum =0;
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<n-2;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-total);

                if(total == target){
                    resSum = total;
                    return resSum;
                }
                else if(diff<minDiff){
                    minDiff = diff;
                    resSum = total;
                }
                else if(total < target){
                    j++;
                }
                else k--;
            }
        }
        return resSum;
    }
}