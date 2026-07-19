class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n=dimensions.length;
        double max_dig=0;
        int max_area=0;
       
        for(int i=0;i<n;i++){
            int l=dimensions[i][0];
            int b=dimensions[i][1];
            double dim_len=Math.sqrt((l*l)+(b*b));
            int area=l*b;
            if(max_dig<dim_len||(dim_len==max_dig&& area>max_area)){
                max_dig=dim_len;
                max_area=area;
            }
        }
        
        return max_area;
    }
}