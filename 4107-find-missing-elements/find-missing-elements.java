class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ls= new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        int min=nums[0];
        int max=nums[0];
        for(int num:nums){
            if(max<num) max=num;
            if(min>num) min=num;
            hs.add(num);
        }

        for(int i=min;i<=max;i++){
            if(!hs.contains(i)) ls.add(i);
        }
        return ls;
    }
}