class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return solve(0, 0, nums, k);
    }

    private boolean solve(int index, int sum, int[] nums, int k) {
        // Base case: target sum found
        if (sum == k) {
            return true;
        }
        // Base case: all elements processed
        if (index == nums.length) {
            return false;
        }
        // Choice 1: Pick the current element
        boolean pick = solve(index + 1, sum + nums[index], nums, k);
        // Choice 2: Do not pick the current element
        boolean notPick = solve(index + 1, sum, nums, k);
        return pick || notPick;
    }
}
