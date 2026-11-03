// 13. Roman to Integer

class Solution {
    private int value(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return -1;
    }
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for(int i=0; i<n-1; i++){
            if(value(s.charAt(i)) < value(s.charAt(i+1))){
                ans -= value(s.charAt(i));
            }
            else{
                ans += value(s.charAt(i));
            }
        }
        ans += value(s.charAt(n-1));
        return ans;
    }
}
