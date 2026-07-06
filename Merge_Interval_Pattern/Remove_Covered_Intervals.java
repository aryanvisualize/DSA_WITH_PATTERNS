//1288. Remove Covered Intervals

class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        Arrays.sort(nums, (a, b) -> {
            if(a[0] == b[0]) return b[1]-a[1];
            return a[0] - b[0];
        });
        int start1 = nums[0][0];
        int end1 = nums[0][1];

        int count = 0;
        int maxEnd = 0;
        for (int[] ele : nums) {
            if (ele[1] > maxEnd) {
                count++;
                maxEnd = ele[1];
            }
        }
        return count;

    }
}