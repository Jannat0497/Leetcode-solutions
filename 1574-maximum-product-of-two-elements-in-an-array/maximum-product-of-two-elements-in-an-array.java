class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int sec_max=0;
        for(int i:nums){
            if(i>max){
                sec_max=max;
                max=i;
            }
            else if(i>sec_max ){
                 sec_max=i;
            }
        }
        return (max-1)*(sec_max-1);
    }
}