//Q3. Largest Rectangle in Histogram

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        //Calculate nse[]
        st.push(n-1);
        nse[n-1] = n;
        for(int i=n-2;i>=0;i--){
            while(st.size() != 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.size()==0) nse[i] = n;
            else if(heights[i] > heights[st.peek()]){
                nse[i] = st.peek();
            }
            st.push(i);
        }
        //Empty stack
        while(st.size()>0) st.pop();

        //Calculate pse[]
        st.push(0);
        pse[0] = -1;
        for(int i=1;i<n;i++){
            while(st.size()!=0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            if(st.size() == 0) pse[i] = -1;
            else if(heights[i] > heights[st.peek()]){
                pse[i] = st.peek();
            }
            st.push(i);
        }

        //Maximum Area of rectangle
        int max = -1;
        for(int i=0;i<n;i++){
            int area = heights[i] * (nse[i]-pse[i]-1);
            max = Math.max(max,area);
        }
        return max;
    }
}