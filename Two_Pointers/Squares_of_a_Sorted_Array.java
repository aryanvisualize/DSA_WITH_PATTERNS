//977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        //Two Pointer --> without extra space(Best Approach)
        int n = nums.length;
        int i = 0, j = n-1;
        int k = n-1;
        int[] ans = new int[n];
        while(i<=j){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                ans[k] = nums[i]*nums[i];
                i++;
            }
            else{
                ans[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return ans;

        //--------------------------------------------------------------------------------------------------


         //Two Pointer --> Using Extra Space & merge sort [O(n) Time & Space]
         int n = nums.length;
         ArrayList<Integer> arr1 = new ArrayList<>();
         ArrayList<Integer> arr2 = new ArrayList<>();

         for (int i = 0; i < n; i++) {
             if (nums[i] < 0) {
                 arr1.add(nums[i]);
             } else {
                 arr2.add(nums[i]);
             }
         }

         // Square negative numbers
         for (int i = 0; i < arr1.size(); i++) {
             arr1.set(i, arr1.get(i) * arr1.get(i));
         }

         // Reverse arr1 because after squaring it is in descending order
         int i = 0, j = arr1.size() - 1;
         while (i < j) {
             int temp = arr1.get(i);
             arr1.set(i, arr1.get(j));
             arr1.set(j, temp);
             i++;
             j--;
         }

         // Square non-negative numbers
         for (int i2 = 0; i2 < arr2.size(); i2++) {
             arr2.set(i2, arr2.get(i2) * arr2.get(i2));
         }

         int n1 = arr1.size();
         int n2 = arr2.size();

         int[] result = new int[n1 + n2];

         i = 0;
         j = 0;
         int k = 0;

         // Merge both sorted ArrayLists
         while (i < n1 && j < n2) {
             if (arr1.get(i) <= arr2.get(j)) {
                 result[k++] = arr1.get(i++);
             } else {
                 result[k++] = arr2.get(j++);
             }
         }

         // Remaining elements of arr1
         while (i < n1) {
             result[k++] = arr1.get(i++);
         }

         // Remaining elements of arr2
         while (j < n2) {
             result[k++] = arr2.get(j++);
         }

         return result;

        //--------------------------------------------------------------------------------------------------


         //Brute force --> O(nlon n)
         for(int i=0;i<nums.length;i++){
             nums[i]= nums[i] * nums[i];
         }
         Arrays.sort(nums);
         return nums;
    }
}