class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        //similar to merge 2 sorted array
        int i = 0;
        int j = 0;
        int n = firstList.length;
        int m = secondList.length;
        ArrayList<int[]> arr = new ArrayList<>();
        while (i < n && j < m) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end) {
                arr.add(new int[] { start, end });
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            }
            else {
                j++;
            }
        }
        return arr.toArray(new int[0][]);

        // while (i < n && j < m) {
        //     int start1 = firstList[i][0];
        //     int end1 = firstList[i][1];
        //     int start2 = secondList[j][0];
        //     int end2 = secondList[j][1];
        //     if (start1 <= start2) {
        //         if (end1 >= start2) {
        //             int s = Math.max(start1, start2);
        //             int e = Math.min(end1, end2);
        //             arr.add(new int[] { s, e });
        //         }
        //     }
        //     else if(start2 < start1){
        //         if (end2 >= start1) {
        //             int s = Math.max(start1, start2);
        //             int e = Math.min(end1, end2);
        //             arr.add(new int[] { s, e });
        //         }
        //     }
        //     if (end1 <= end2) {
        //         i++;
        //     }
        //     else {
        //         j++;
        //     }
        // }
        // return arr.toArray(new int[0][]);
    }
}