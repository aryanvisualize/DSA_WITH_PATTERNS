//704. Binary Search

class Solution {
    public int search(int[] nums, int target) {
        //Binary Search

        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] < target){
                low = mid+1;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
        }
        return -1;

        // //Brute force
        // int n = nums.length;
        // for(int i=0; i<n; i++){
        //     if(nums[i]==target) return i;
        // }
        // return -1;
    }
}