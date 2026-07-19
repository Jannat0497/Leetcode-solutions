import java.util.*;
class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0; 
        }
        Arrays.sort(nums);
        int n=nums.length;
        int diff=0,max_diff=0;
        for(int i=0;i<n-1;i++){
            diff=nums[i+1]-nums[i];
            max_diff=Math.max(max_diff,diff);
        }
        return max_diff;
    }
}
