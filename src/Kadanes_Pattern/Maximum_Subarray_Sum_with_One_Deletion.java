//1186. Maximum Subarray Sum with One Deletion

class Solution {
    public int maximumSum(int[] arr) {
        //Kadanes Algo
        int n = arr.length;
        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int ans = arr[0];

        for(int i=1; i<n; i++){
            int prevNoDelete = noDelete;
            noDelete = Math.max(arr[i], noDelete + arr[i]);
            if(oneDelete == Integer.MIN_VALUE){
                oneDelete = prevNoDelete;   //// delete current element
            }
            else{
                oneDelete = Math.max(prevNoDelete, oneDelete + arr[i]);
            }
            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }
        return ans;
    }
}