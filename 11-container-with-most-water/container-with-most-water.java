class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int max=Integer.MIN_VALUE;
        while(l<=h){
            int len=Math.min(height[l],height[h]);
            int breadth=h-l;
            int area=len*breadth;
            max=Math.max(max,area);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return max;
    }
}