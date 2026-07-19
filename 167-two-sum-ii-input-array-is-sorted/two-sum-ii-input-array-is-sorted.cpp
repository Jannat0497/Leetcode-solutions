class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
       vector <int>arr(2);
       int left=0,right=numbers.size()-1;
       while(left<right){
        int sum=numbers[left]+numbers[right];
        if(sum==target){
            arr[0]=left+1;
            arr[1]=right+1;
            break;
        }
        else if (sum>target){
            right--;
        }
        else{
            left++;
        }
       }
       return arr;

    }
};