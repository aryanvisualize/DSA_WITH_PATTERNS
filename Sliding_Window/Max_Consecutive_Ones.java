//485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        //Optimal solution
        int current = 0;
        int maxCount = 0;
        for(int ele : arr){
            if(ele == 1){
                current++;
                maxCount = Math.max(maxCount, current);
            }
            else{
                current = 0;
            }
        }
        return maxCount;

        // // //Sliding window
        // int left=0;
        // int sum =0;
        // int ans = -1;
        // for(int right=0; right < arr.length; right++){
        //     sum  += arr[right];

        //     while(right-left+1 != sum){
        //         sum -= arr[left];    //Do some logic to remove the left from window and left++
        //         left++;
        //     }
        //     ans = Math.max(ans, right-left+1);
        // }
        // return ans;


        // int left =0;
        // int maxLen= 0;

        // for(int right =0; right<arr.length; right++){
        //     if(arr[right] == 0){
        //         left = right+1;
        //     }
        //     //update the ans
        //     maxLen = Math.max(maxLen, right-left+1);
        // }
        // return maxLen;


        // //Brute force
        // int n = arr.length;
        // int maxCount = 0;
        // for(int i=0;i<n;i++){
        //     int count = 0;
        //     for(int j=i; j<n; j++){
        //         if(arr[j]==1) count++;
        //         else break;
        //     }
        //     maxCount = Math.max(maxCount,count);
        // }
        // return maxCount;
    }
}