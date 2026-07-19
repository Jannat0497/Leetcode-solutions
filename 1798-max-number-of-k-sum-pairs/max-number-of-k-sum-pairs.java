class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); 
        int count=0;
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int sum=nums[l]+nums[h];
            if(sum==k){
                count++;
                l++;
                h--;
            }
            else if(sum<k){
                l++;
            }
            else{
                h--;
            }
            
        }
        return count;
    }
}