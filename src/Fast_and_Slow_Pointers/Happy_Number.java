//202. Happy Number
class Solution {
    private int nextSum(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            int sqr = digit*digit;
            sum += sqr;
            n = n/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        //Using fast & slow pointers O(k log n) optimal approach
        int slow = n;
        int fast = n;
        do{
            slow = nextSum(slow);
            fast = nextSum(nextSum(fast));
        }
        while(slow != fast);
        return slow == 1;

        // HashSet<Integer> set = new HashSet<>();
        // //Brute force  ----> Using HashSet O(k log n), O(k) space
        // while(n!=1){
        //     int sqrSum =0;
        //     if(set.contains(n)) return false;
        //     set.add(n);
        //     while(n>0){
        //         int digit = n%10;
        //         int sqr = digit*digit;
        //         sqrSum += sqr;
        //         n = n/10;
        //     }
        //     n= sqrSum;
        // }
        // return true;
    }
}