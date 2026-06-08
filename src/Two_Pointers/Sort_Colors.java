//75. Sort_Colors
class Solution {
    public void sortColors(int[] nums) {
        //Dutch National Flag Algorithm (Best Approach)
        int n = nums.length;

        int low =0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            //case 1    ---> Swap with low
            if(nums[mid] == 0){

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }

            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }



        // //Better Approach
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0) zeros++;
        //     if(nums[i]==1) ones++;
        // }
        // for(int i=0;i<n;i++){
        //     if(i<zeros) nums[i]=0;
        //     else if(i < zeros+ones) nums[i]=1;
        //     else nums[i]=2;
        // }


        // int zeros = 0;
        // int ones = 0;
        // int twos = 0;
        // int n = nums.length;

        // for(int i=0;i<n;i++){
        //     if(nums[i]==0) zeros++;
        //     if(nums[i]==1) ones++;
        //     if(nums[i]==2) twos++;
        // }
        // int idx=0;
        // for(int i=0;i<zeros;i++){
        //     nums[idx++] = 0;
        // }
        // for(int i=0;i<ones;i++){
        //     nums[idx++] = 1;
        // }
        // for(int i=0; i<twos;i++){
        //     nums[idx++] = 2;
        // }


        // //Brute Force---> Using extra space O(n)
        // ArrayList<Integer> zeros = new ArrayList<>();
        // ArrayList<Integer> ones = new ArrayList<>();
        // ArrayList<Integer> twos = new ArrayList<>();
        // int n = nums.length;
        // for(int ele : nums){
        //     if(ele == 0) zeros.add(ele);
        //     else if(ele == 1) ones.add(ele);
        //     else twos.add(ele);
        // }
        // int idx = 0;
        // for(int i=0;i<zeros.size();i++){
        //     nums[idx++]=0;
        // }
        // for(int i=0;i<ones.size();i++){
        //     nums[idx++]=1;
        // }
        // for(int i=0;i<twos.size();i++){
        //     nums[idx++]=2;
        // }
    }
}