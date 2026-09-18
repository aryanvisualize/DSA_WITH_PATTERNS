//875. Koko Eating Bananas

class Solution {
    private long canEat(int mid, int[] piles) {
        long hour = 0;
        for (int ele : piles) {
            hour += (ele + mid - 1) / mid;
        }
        return hour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int ele : piles) {
            max = Math.max(max, ele);
        }
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long hour = canEat(mid, piles);
            if (hour > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}