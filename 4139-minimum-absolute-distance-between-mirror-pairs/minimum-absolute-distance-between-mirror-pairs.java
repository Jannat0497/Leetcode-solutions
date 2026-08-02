class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(nums[i])) {
                min=Math.min(min,i-map.get(nums[i]));
            }
            int rev=0,temp=nums[i];
            while (temp>0) {
                rev=(rev*10)+(temp%10);
                temp/=10;
            }
            map.put(rev,i);
        }
        
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}