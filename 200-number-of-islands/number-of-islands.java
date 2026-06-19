class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    private void dfs(int row,int col,char[][] grid){
        if(isValid(row,col,grid)){
            grid[row][col]='2';
            dfs(row+1,col,grid);
            dfs(row-1,col,grid);
            dfs(row,col+1,grid);
            dfs(row,col-1,grid);
        }
    }

    private boolean isValid(int row,int col,char[][] grid){
        if(row<0 || row>=grid.length) return false;
        if(col<0 || col>=grid[0].length) return false;

        if(grid[row][col]=='1') return true;
        return false;
    }
}