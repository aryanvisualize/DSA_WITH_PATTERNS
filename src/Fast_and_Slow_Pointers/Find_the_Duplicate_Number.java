//287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        //Using Floyd's cycle Detection (Fast and slow pointers)
        //Pigeonhole principle -> More nodes than destination
        int slow = nums[0];
        int fast = nums[0];

        //Find cycle
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(fast != slow);

        //Find entry point of Cycle
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

        // //Using HashSet ---> Using O(n) time & space
        // HashSet<Integer> set = new HashSet<>();
        // for(int ele : nums){
        //     if(set.contains(ele)) return ele;
        //     else set.add(ele);
        // }
        // return -1;

        // //Brute force ---> TLE o(n^2)
        // int n = nums.length;
        // for(int i=0; i<n;i++){
        //     for(int j=i+1; j<n;j++){
        //         if(nums[i]==nums[j]) return nums[i];
        //     }
        // }
        // return -1;
    }
}