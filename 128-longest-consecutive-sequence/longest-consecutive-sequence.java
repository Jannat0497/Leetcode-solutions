class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int max=1;
        int n =nums.length;
        for(int i=1;i<n;i++){
            int diff=nums[i]-nums[i-1];
            System.out.print(diff+" ");
            if(diff==0){
                continue;
            }
            else if(diff==1){
                count++;
            }
            else{
                max=Math.max(count,max);
                count=1;
            }
        }
        return Math.max(count,max);
    }
}