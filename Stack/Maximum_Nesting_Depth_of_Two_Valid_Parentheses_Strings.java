//1111. Maximum Nesting Depth of Two Valid Parentheses Strings


class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                answer[i] = i % 2;
            } else {
                answer[i] = 1 - (i % 2);
            }
        }
        return answer;
    }
}