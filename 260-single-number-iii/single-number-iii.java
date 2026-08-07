class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr= new int[2];
        int val=0;
        for(int i=0;i<nums.length;i++){
            val^=nums[i];
        }
        int set=val&-val;
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if((set&nums[i])==0) a^=nums[i];
            else b^=nums[i];
        }
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
}