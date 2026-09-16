class Solution {
    private boolean canShip(ArrayList<Integer> arr, int d, int capacity){
        int days = 1;
        int currentLoad = 0;
        for(int x : arr){
            if(currentLoad + x > capacity){
                days++;
                currentLoad = x;
            } else{
                currentLoad += x;
            }
        }
        return days <= d;
    }


    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        //low = maximum package weight
        // high = sum of all packages
        //I have to find low as minimum valid capacity
        int high = 0;
        int low = 0;
        for(int x: arr){
            low = Math.max(low, x);
            high += x;
        }
        //Apply binary search
        while(low < high){
            int mid = low +(high-low)/2;
            if(canShip(arr, d, mid)){
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}