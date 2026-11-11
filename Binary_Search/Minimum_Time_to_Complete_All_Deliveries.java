// 3733. Minimum Time to Complete All Deliveries

class Solution {

    public long minimumTime(int[] d, int[] r) {

        long d1 = d[0];
        long d2 = d[1];

        long r1 = r[0];
        long r2 = r[1];

        long left = 1;
        long right = (long) 1e18;

        long lcm = lcm(r1, r2);

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (canComplete(mid, d1, d2, r1, r2, lcm)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canComplete(
        long t,
        long d1,
        long d2,
        long r1,
        long r2,
        long lcm
    ) {

        long available1 = t - t / r1;
        long available2 = t - t / r2;

        long availableTotal = t - t / lcm;

        return available1 >= d1
            && available2 >= d2
            && availableTotal >= d1 + d2;
    }

    private long gcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
