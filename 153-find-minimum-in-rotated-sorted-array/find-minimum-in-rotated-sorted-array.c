int findMin(int* nums, int numsSize) {
    int min=nums[0];
    for(int i=0;i<numsSize;i++){
        if(nums[i]<min){
            int temp=nums[i];
            nums[i]=min;
            min=temp;
        }
    }
    return min;
}