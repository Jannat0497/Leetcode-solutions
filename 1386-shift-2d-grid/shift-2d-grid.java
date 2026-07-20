class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ls1 = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length; 
        int total = n * m;    
        k = k % total;       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ls.add(grid[i][j]);
            }
        }
        Collections.rotate(ls, k);
        int index = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> Row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                Row.add(ls.get(index++));
            }
            ls1.add(Row);
        }
        return ls1;
    }
}