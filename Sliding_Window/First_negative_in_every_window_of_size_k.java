//First negative in every window of size k

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {

        //Sliding Window --> Storing negative nums
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;

        for(int j=0; j<n; j++){
            if(arr[j] < 0){
                q.offer(arr[j]);
            }

            if(j>=k-1){
                if(q.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(q.peek());
                }
                int outgoing = arr[j-k+1];
                if(!q.isEmpty() && outgoing == q.peek()){
                    q.poll();
                }
            }
        }
        return ans;



        // //Brute Force
        // List<Integer> ans = new ArrayList<>();
        // int n = arr.length;
        // for(int i=0; i<= n-k; i++){
        //     boolean found = false;
        //     // Check each element in the current window
        //     for(int j=i; j<i+k; j++){
        //         if(arr[j]<0){
        //             ans.add(arr[j]);
        //             found = true;
        //             break;
        //         }
        //     }
        //     //If no negative found
        //     if(!found){
        //         ans.add(0);
        //     }

        // }
        // return ans;
    }
}