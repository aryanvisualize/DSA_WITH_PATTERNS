// 1385. Find the Distance Value Between Two Arrays

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //Binary search
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;

        int count = 0;
        for(int i=0; i<n1; i++){
            int low = 0;
            int high = n2-1;
            boolean valid = true;

            while(low <= high){
                int mid = low + (high-low)/2;
                if (Math.abs(arr1[i] - arr2[mid]) <= d) {
                    valid = false;
                    break;
                }
                else if (arr2[mid] < arr1[i] - d) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if(valid) count++;
        }
        return count;

        // // O(n1 * n2) Time
        // int n1 = arr1.length;
        // int n2 = arr2.length;
        // int count = 0;
        
        // for(int i=0; i<n1; i++){
        //     boolean satisfy = true;
        //     for(int j=0; j<n2; j++){
        //         if(Math.abs(arr1[i] - arr2[j]) <= d){
        //             satisfy = false;
        //             break;
        //         }
        //     }
        //     if(satisfy) count++;
        // }
        // return count;
    }
}
