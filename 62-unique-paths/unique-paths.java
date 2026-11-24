class Solution {
    public int uniquePaths(int m, int n) {
       int[][] memo=new int[m+1][n+1];
       return count(m,n,memo);
    }
    public int count(int m,int n,int[][]memo){
        if(m<0 || n<0) return 0;
        if(m==1 || n==1) return 1;
        if (memo[m][n] != 0) return memo[m][n];
        return memo[m][n] = count(m - 1, n, memo) + count(m, n - 1, memo);
    }
}