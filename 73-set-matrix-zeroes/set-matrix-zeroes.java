class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        boolean[] a=new boolean[r];
        boolean[] b=new boolean[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    a[i]=true;
                    b[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i] || b[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}