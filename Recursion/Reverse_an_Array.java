//Reverse an Array

class Solution {
    private void swap(int i, int j, int arr[]){
        if(i>=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        swap(i+1, j-1, arr);
    }
    public void reverseArray(int arr[]) {
        // code here
        swap(0, arr.length-1, arr);
    }
}