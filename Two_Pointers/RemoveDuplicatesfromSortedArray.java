//RemoveDuplicatesfromSortedArray.java
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0, j = i+1;
        int unique = 1;
        while(j<n){
            if(nums[j]==nums[j-1]){
                j++;
            }
            else if(nums[i] != nums[j]){
                i++;
                nums[i]=nums[j];
                j++;
                unique++;
            }
        }
        return unique;
    }
}