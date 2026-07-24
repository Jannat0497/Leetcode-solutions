class Solution {
    public int nthUglyNumber(int n) {
        int i2=0;
        int i3=0;
        int i5=0;
        int num=0;
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            int N2=dp[i2]*2;
            int N3=dp[i3]*3;
            int N5=dp[i5]*5;
            dp[i]=Math.min(N2,Math.min(N3,N5));
            if (dp[i] == N2) i2++;
            if (dp[i] == N3) i3++;
            if (dp[i] == N5) i5++;
        }
    return dp[n - 1];  
    } 
}