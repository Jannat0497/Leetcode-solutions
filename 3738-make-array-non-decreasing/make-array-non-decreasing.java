class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count =0;
        int max=0;
        for(int i:nums){
            if(i>=max){
                max=i;
                count++;
            }
        }
        return count;
    }
}