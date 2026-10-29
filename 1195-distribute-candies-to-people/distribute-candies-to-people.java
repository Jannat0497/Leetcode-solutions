class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n=num_people;
        int [] res=new int[n];
        int give=1;
        int i=0;
        while(candies>0){
            res[i%n]+=Math.min(give,candies);
            candies-=give;
            give++;
            i++;
        }
        return res;
    }
}