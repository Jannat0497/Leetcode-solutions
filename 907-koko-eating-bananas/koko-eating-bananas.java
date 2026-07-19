class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high=0;
        for(int i=0;i<piles.length;i++){
           high=Math.max(piles[i],high);
        }
        int low=1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hr=0;
            for(int i:piles){
                hr+=(i+mid-1)/mid;
            }
            if(hr<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}