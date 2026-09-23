//540. Single_Element_in_a_Sorted Array.java

class Solution {
    public int singleNonDuplicate(int[] nums) {
        //binary search
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low < high){
            int mid = low + (high - low)/2;
            if(mid %2 != 0) mid = mid-1;
            if(nums[mid] == nums[mid+1]) low = mid+2;
            else high = mid;
        }
        return nums[low];
    }
}