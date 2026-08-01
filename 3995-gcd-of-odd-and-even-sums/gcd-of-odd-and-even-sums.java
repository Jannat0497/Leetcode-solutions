class Solution {
    public int gcd(int i,int j){
        if(j==0) return i;
        return gcd(j,i%j);
    }
    public int gcdOfOddEvenSums(int n) {
        int countOdd=0;
        int countEven=0;
        for(int i=1;i<=n;i++){
            countOdd += (2 * i - 1);
            countEven += (2 * i);
        }
        return gcd(countOdd,countEven);
    }
}