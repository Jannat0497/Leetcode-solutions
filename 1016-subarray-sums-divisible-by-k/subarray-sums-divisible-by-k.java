class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rev=sum%k;
            if(rev<0) rev+=k;
            ans+=map.getOrDefault(rev,0);
            map.put(rev,map.getOrDefault(rev,0)+1);
        }
        return ans;
    }
}