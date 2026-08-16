class Solution {
    public int longestSubsequence(int[] nums) {
        int len=0;
        int val=0;
        for(int i=0;i<nums.length;i++){ 
            val^=nums[i];
            len++;
        }
        if(val!=0){
            return len;
        }
        for (int x : nums) {
            if (x != 0)
                return len - 1;
        }

        return 0;
    }
}