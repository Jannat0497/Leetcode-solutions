class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char ch=board[i][j];
                if(ch=='.'){
                    continue;
                }
                int num=ch-'1';
                int boxIndex = (i / 3) * 3 + (j / 3);
                if(rows[i][num] || cols[j][num] || boxes[boxIndex][num]){
                    return false;
                }
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        
        return true;
    }
}