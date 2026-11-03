// 344. Reverse String

class Solution {
    private void reverse(char[] s, int low, int high){
        if(low >= high) return;
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        reverse(s, low+1, high-1);
    }
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length -1;
        reverse(s, low, high);
    }
}
