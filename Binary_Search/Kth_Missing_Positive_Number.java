class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
          int low =0, hi = n-1;
          while(low<=hi){
              int mid = low+(hi-low)/2;
              int correctNo = mid+1;
              int missing = arr[mid]-correctNo;
              if(missing >= k) hi = mid-1;
              else low = mid+1;
          }
          return hi+1+k;
    }
}
