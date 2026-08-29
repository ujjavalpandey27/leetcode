class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int nse=0;
        int largestarea=0;
        int area=0;
        int pse=0;

        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int index= st.pop();
                nse=i;
                if(st.isEmpty()){
                    pse=-1;
                }
                else
                pse=st.peek();

                area=heights[index] * (nse-pse-1);
                largestarea=Math.max(largestarea,area);

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int index=st.pop();
            nse=heights.length;

            if(st.isEmpty()){
                pse=-1;
            }
            else
            pse=st.peek();
            area=heights[index]*(nse-pse-1);
            largestarea=Math.max(largestarea,area);
        }
        return largestarea;


    }
}