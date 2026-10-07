// Find Nth root of a number

class Solution {
    long solver(int mid, int N, int M){
        long power = 1;
        for(int i=1; i<=N; i++){
            power *= mid;
            if(power > M){
                return 2;
            }
        }
        if(power == M){
            return 0;
        } else if(power < M){
            return 1;
        } else {
            return 2;
        }
    }
    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(solver(mid, N, M) == 0) return mid;
            else if(solver(mid, N, M) == 2){
                high = mid-1;
            } else if(solver(mid, N, M) == 1){
                low = mid+1;
            }
        }
        return -1;

        // //Linera approach
        // for(int i=1; i<=M; i++){
        //     int power = 1;
        //     for(int j=1; j<=N; j++){
        //         power *= i;
        //     }
        //     if(power == M){
        //         return i;
        //     }
        //     if(power > M){
        //         break;
        //     }
        // }
        // return -1;
    }
}
