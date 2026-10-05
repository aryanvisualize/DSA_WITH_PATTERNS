class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid;
            }
            if (sum <= threshold) {
                // mid works, but we want the smallest divisor
                high = mid - 1;
            } else {
                // mid is too small
                low = mid + 1;
            }
        }
        return low;
    }
}
