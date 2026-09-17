class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2){
                list.add(nums[i]);
            }
        }
        return list;
    }
}