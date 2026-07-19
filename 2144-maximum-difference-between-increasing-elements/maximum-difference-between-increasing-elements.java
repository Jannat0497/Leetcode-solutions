class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int min=nums[0];
        for(int i=0;i<n;i++){
            prefix[i]=Math.min(min,nums[i]);
            min=prefix[i];
        }
        int max=-1;
        for(int i=1;i<n;i++){
            int diff=nums[i]-prefix[i-1];
            if(diff>0){
            max=Math.max(diff,max);
            }
        }
        return max;
    }
}