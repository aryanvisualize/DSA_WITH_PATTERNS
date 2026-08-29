//Palindrome String

class Solution {
    boolean check(int i, int j, String s){
        if(i >= j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;

        if(s.charAt(i) == s.charAt(j) && check(i+1, j-1, s)) return true;
        return false;
    }
    boolean isPalindrome(String s) {
        // code here
        return check(0,s.length()-1,s);
    }
}