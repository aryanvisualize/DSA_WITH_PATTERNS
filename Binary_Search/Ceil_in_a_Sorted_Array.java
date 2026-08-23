//Ceil in a Sorted Array

class Solution {
    public int findCeil(int[] arr, int x) {
        //Binary Search
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;


        // //Brute force
        // int n = arr.length;
        // for(int i=0; i<n; i++){
        //     if(arr[i]>=x) return i;
        // }
        // return -1;
    }
}
