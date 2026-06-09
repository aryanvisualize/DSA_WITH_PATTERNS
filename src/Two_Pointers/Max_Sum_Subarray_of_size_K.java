class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        //Sliding Window
        int n = arr.length;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        int maxi = windowSum;
        for(int i=k;i<n;i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            maxi = Integer.max(maxi, windowSum);
        }
        return maxi;
        // //brute force
        // int n = arr.length;
        // int maxi = Integer.MIN_VALUE;

        // for(int i=0;i<=n-k;i++){
        //     int sum = 0;
        //   for(int j=i;j<i+k;j++){
        //       sum += arr[j];
        //   }
        //   maxi = Math.max(maxi,sum);
        // }
        // return maxi;

    }
}