//57. Insert Interval

class Solution {
    public int[][] merge(int[][] nums) {
        //if end1 < start2 -> non overlap
        //else overlap
        Arrays.sort(nums, (a,b)-> Integer.compare(a[0], b[0]));

        int start1 = nums[0][0];
        int end1 = nums[0][1];

        ArrayList<int[]> ans = new ArrayList<>();

        for(int i=1; i<nums.length; i++){
            int start2 = nums[i][0];
            int end2 = nums[i][1];
            if(end1 >= start2){ //There is overlap -> merge
                // start1 = start1;
                end1 = Math.max(end1, end2);
            }
            else{   //No overlap
                ans.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }
        ans.add(new int[]{start1, end1});
        return ans.toArray(new int[ans.size()][]);
    }


    public int[][] insert(int[][] num, int[] newNum) {
        int[][] arr = new int[num.length+1][];
        for(int i=0; i<num.length; i++){
            arr[i] = num[i];
        }
        arr[num.length] = newNum;

        return merge(arr);


        // int start2 = newNum[0];
        // int end2 = newNum[1];

        // ArrayList<int[]> ans = new ArrayList<>();

        // for(int i=0; i<num.length; i++){
        //     int start1 = num[i][0];
        //     int end1 = num[i][1];

        //     if(end1 < start2){
        //         ans.add(num[i]);
        //     }
        //     else if(start1 > end2){
        //         ans.add(new int[]{start2, end2});
        //         start2 = start1;
        //         end2 = end1;
        //     }
        //     else{
        //         start2 =  Math.min(start1, start2);
        //         end2 = Math.max(end1, end2);
        //     }
        // }
        // ans.add(new int[]{start2, end2});
        // return ans.toArray(new int[ans.size()][]);
    }
}