class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int k=4;
        int n=mat.length;
        while(k-->0){
           if(Arrays.deepEquals(mat,target)){
                return true;
           }
           for (int i = 0; i < n; i++){
                for (int j = i + 1; j < n; j++) {
                    int t = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = t;
                }
            }
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n / 2; j++) {
                    int t = mat[i][j];
                    mat[i][j] = mat[i][n - 1 - j]; 
                    mat[i][n - 1 - j] = t;
                }
            }
        }
        return false;
    }
}