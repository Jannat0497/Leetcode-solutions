class Solution {
    public int[] numberOfPairs(int[] nums) {
       
        Arrays.sort(nums);
        int[] arr=new int[2];
        int i=0;
        int count=0;
        int non_match=0;
        int n=nums.length;
        while(i<n){
            if(i==n-1 || nums[i]!=nums[i+1]){
                i++;
                non_match++;
            }
            else{
                i+=2;
                count++;
            }
        }
        arr[0]=count;
        arr[1]=non_match;
        return arr;
    }
}