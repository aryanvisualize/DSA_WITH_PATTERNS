// 3364. Minimum Positive Sum Subarray

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        //Sliding Window
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        for (int k = l; k <= r; k++) {
            int sum = 0;
            // Calculate initial window sum
            for (int i = 0; i < k; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) {
                min = Math.min(min, sum);
            }
            // Slide the window
            for (int i = k; i < n; i++) {
                sum += nums.get(i);
                sum -= nums.get(i - k);
                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;

        // //Brute Force
        // int min = Integer.MAX_VALUE;
        // int n = nums.size();
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i; j<n; j++){
        //         sum += nums.get(j);
        //         int len = j-i+1;
        //         if(len >= l && len <= r && sum > 0){
        //             min = Math.min(min, sum);
        //         }
        //         if(len >= r){
        //             break;
        //         }
        //     }
        // }
        // return min == Integer.MAX_VALUE ? -1 : min;
    }
}
