//724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        //Prefix Sum -> Without extra space
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        for(int i=0;i<n;i++){
            right = sum - nums[i] - left;
            if(left == right) return i;
            left += nums[i];
        }
        return -1;



        // //Prefix Sum -> Using extra space
        // int n = nums.length;
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];

        // for(int i=1;i<n;i++){
        //     prefix[i] = prefix[i-1] + nums[i-1];
        // }

        // for(int i= n-2; i>=0; i--){
        //     suffix[i] = suffix[i+1] + nums[i+1];
        // }

        // for(int i=0; i<n; i++){
        //     if(prefix[i] == suffix[i]) return i;
        // }
        // return -1;
    }
}