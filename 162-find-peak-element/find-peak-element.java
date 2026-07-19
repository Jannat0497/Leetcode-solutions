class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length-1;
        int low = 0;
        int high = len;
        if(nums.length<2){
            return 0;
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid == 0){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }else{
                    high = mid-1;
                }
            }
            if(mid == len){
                if(nums[mid]>nums[mid-1]){
                    return mid;
                }else{
                    low = mid+1;
                }
            }
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                low = mid+1;
            }else if(nums[mid-1]>nums[mid]){
                high = mid-1;
            }
        }
        return low;
    }
}