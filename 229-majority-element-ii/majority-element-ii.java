class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int f=nums.length/3;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > f) {
                list.add(key);
            }
        }
        
        return list;
    }
}