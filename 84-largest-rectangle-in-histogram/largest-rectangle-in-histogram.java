class Solution{
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] right=new int[n];
        int[] left=new int[n];
        right[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>= heights[i])
            {
                st.pop();
            }
            if(st.isEmpty()) right[i]=n;
            else right[i]=st.peek();
            st.push(i);
        }

        st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty()) left[i]=-1;
            else left[i]=st.peek();
            st.push(i);
        }
        int maxArea=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            int height=heights[i];
            int width=right[i]-left[i]-1;
            int area=height*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
        
    }
}
