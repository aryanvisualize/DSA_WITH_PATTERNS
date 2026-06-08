//713. Subarray_Product_Less_Than_K
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //Optimal
        if(k<=1) return 0;

        int n = nums.length;
        int left = 0;
        int product = 1;
        int count = 0;

        for(int right=0; right<n; right++){
            product *= nums[right];

            while(product>= k){
                product = product/nums[left];
                left++;
            }
            count += right-left+1;
        }
        return count;

        // //Brute force
        // int n = nums.length;
        // int count = 0;

        // for(int i=0;i<n;i++){
        //     double pro = 1;
        //     for(int j=i;j<n;j++){
        //         pro *= nums[j];

        //         if(pro<k) count++;
        //     }
        // }
        // return count;
    }
}