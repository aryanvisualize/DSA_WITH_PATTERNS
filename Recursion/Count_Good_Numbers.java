// 1922. Count Good Numbers


class Solution {
    static final int MOD = 1_000_000_007;

    private long solve(long index, long n) {
        if (index == n) {
            return 1;
        }
        long choices;
        if (index % 2 == 0) {
            choices = 5;
        } else {
            choices = 4;
        }
        return (choices * solve(index + 1, n)) % MOD;
    }

    public int countGoodNumbers(long n) {
        return (int) solve(0, n);
    }
}
