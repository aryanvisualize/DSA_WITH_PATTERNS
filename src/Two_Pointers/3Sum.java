//15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();   //Using extra space

        int n = nums.length;
        Arrays.sort(nums);

        //Two Pointer --> O(n^2)
        for(int i=0;i<n-2;i++){
            int j = i+1, k=n-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k] == 0){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);

                    Collections.sort(arr);
                    set.add(arr);
                    j++;
                    k--;
                }

            }
        }
        ans.addAll(set);
        return ans;

        //----------------------------------------------------------------------------------------


        // //Brute Force-----> O(n^3)

        // int n = nums.length;
        // List<List<Integer>> ans = new ArrayList<>();
        // Set<List<Integer>> set = new HashSet<>();

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> arr = new ArrayList<>();

        //                 arr.add(nums[i]);
        //                 arr.add(nums[j]);
        //                 arr.add(nums[k]);
        //                 Collections.sort(arr);

        //                 set.add(arr);
        //             }
        //         }
        //     }
        // }
        // ans.addAll(set);
        // return ans;
    }
}