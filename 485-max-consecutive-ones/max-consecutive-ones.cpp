class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int max1=0,max_num=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1)max_num+=1;
            else max_num=0;
            max1=max(max1,max_num);
        }
        return max1;
    }
};