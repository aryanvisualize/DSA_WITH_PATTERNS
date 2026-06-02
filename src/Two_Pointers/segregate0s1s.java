class Solution {
    void segregate0and1(int[] arr) {
        //Two pointer   //O(n)  Slightly better
        int i=0, j = arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }


        // //brute force    //O(n)
        // int count = 0;
        // for(int ele : arr){
        //     if(ele == 0) count++;
        // }
        // for(int i=0;i<count;i++){
        //     arr[i]=0;
        // }
        // for(int i=count;i<arr.length;i++){
        //     arr[i]=1;
        // }

    }
}
