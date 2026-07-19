double findMaxAverage(int* nums, int numsSize, int k) {
    double temp_sum=0;
    for(int i=0;i<k;i++){
        temp_sum+=nums[i];
    }
    double max;
    max=temp_sum;
    for(int i=k;i<numsSize;i++){
        temp_sum+=nums[i]-nums[i-k];
        if(temp_sum>max){
            max=temp_sum;
        }
    }
    return max/k;
}