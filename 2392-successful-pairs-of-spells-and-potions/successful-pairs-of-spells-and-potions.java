class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr= new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int low=0;
            int high=potions.length-1;
            int n=potions.length;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((long)spells[i]*potions[mid]>=success){
                    n=mid;
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            arr[i]=potions.length-n;
        }
        return arr;
    }
}