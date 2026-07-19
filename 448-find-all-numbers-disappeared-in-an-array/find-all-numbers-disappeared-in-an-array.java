class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ls= new ArrayList<>();
        int idx=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            while (idx < n && nums[idx] < i) {
                idx++;
            }
            if(idx<n && nums[idx]==i){
                idx++;
            }
            else{
                ls.add(i);
            }
        }
        return ls;
    }
}