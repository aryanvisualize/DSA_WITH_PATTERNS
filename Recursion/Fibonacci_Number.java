//Fibonacci Number

class Solution {
    int solve(int n, int[] arr){
        if(n==0) return 0;
        if(n==1) return 1;
        if(arr[n] != -1) return arr[n];
        return arr[n] = solve(n-1,arr) + solve(n-2, arr);
    }
    public int fib(int n) {
        int[] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }
        return solve(n, arr);
    }
}