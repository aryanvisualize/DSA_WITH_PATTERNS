class Solution {
    public int missingNumber(int[] arr) {
        int sum =0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int actualSum = n*(n+1)/2;
        return actualSum-sum;
        //     //Cycle sort method
        //     int i=0, n= arr.length;
        //     while(i<arr.length){
        //         if(arr[i] == i) i++;
        //         else if (arr[i]==n) i++;
        //         else{
        //             int idx = arr[i];
        //             int temp = arr[i];
        //             arr[i] = arr[idx];
        //             arr[idx] = temp;
        //         }
        //     }
        //     for(i=0;i<arr.length;i++){
        //         if(arr[i] != i) return i;
        //     }
        //     return n;
    }
}