//Smallest sum contiguous subarray

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        int n = a.length;
        int bestEnding = 0;
        int ans = a[0];
        for(int i=0; i<n;i++){
            int v1 = bestEnding + a[i];
            int v2 = a[i];
            bestEnding = Math.min(v1, v2);
            ans = Math.min(ans,bestEnding);
        }
        return ans;
    }
}