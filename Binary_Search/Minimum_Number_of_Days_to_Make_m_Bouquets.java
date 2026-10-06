//1482. Minimum Number of Days to Make m Bouquets


class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        // Not enough flowers
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        // Find the minimum and maximum bloom days
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    private boolean canMakeBouquets(
            int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int consecutive = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                consecutive++;
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;
                }
            } else {
                consecutive = 0;
            }
            if (bouquets >= m) {
                return true;
            }
        }
        return false;
    }
}
