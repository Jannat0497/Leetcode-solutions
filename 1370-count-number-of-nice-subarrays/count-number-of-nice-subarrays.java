class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int nice=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]%2;
            nice+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return nice;
    }
}