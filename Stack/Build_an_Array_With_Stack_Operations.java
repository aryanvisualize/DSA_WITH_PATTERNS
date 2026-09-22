//1441. Build an Array With Stack Operations

class Solution {
    public List<String> buildArray(int[] target, int n) {
        //Brute force
        List<String> ans = new ArrayList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (i == target[j]) {
                ans.add("Push");
                j++;
                if (j == target.length) {
                    break;
                }
            }
            else {
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}