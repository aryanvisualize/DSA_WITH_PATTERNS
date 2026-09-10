//852. Peak Index in a Mountain Array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low < high){
            mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}