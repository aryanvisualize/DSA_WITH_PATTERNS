// 1888. Minimum Number of Flips to Make the Binary String Alternating

class Solution {

    public int minFlips(String s) {
        int n = s.length();

        int count1 = 0;
        int count2 = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 2 * n; i++) {

            char ch = s.charAt(i % n);
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if (ch != expected1) count1++;
            if (ch != expected2) count2++;

            if (i >= n) {
                char old = s.charAt((i - n) % n);
                char oldExpected1 =
                    ((i - n) % 2 == 0) ? '0' : '1';

                char oldExpected2 =
                    ((i - n) % 2 == 0) ? '1' : '0';
                if (old != oldExpected1) count1--;
                if (old != oldExpected2) count2--;
            }

            if (i >= n - 1) {
                ans = Math.min(ans, Math.min(count1, count2));
            }
        }
        return ans;
    }
}
