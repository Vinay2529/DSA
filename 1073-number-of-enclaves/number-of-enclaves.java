class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    grid[i][j]=2;
                }
            }
        }
        for(int j=0;j<n;j++){
            dfsCore(0,j,grid);
        }
        for(int j=0;j<n;j++){
            dfsCore(m-1,j,grid);
        }
        for(int j=0;j<m;j++){
            dfsCore(j,0,grid);
        }
        for(int j=0;j<m;j++){
            dfsCore(j,n-1,grid);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    count++;
                }
            }
        }
        return count;
    }
    private void dfsCore(int row,int col,int[][] grid){
        if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==2){
            grid[row][col]='1';
            dfsCore(row-1,col,grid);
            dfsCore(row+1,col,grid);
            dfsCore(row,col+1,grid);
            dfsCore(row,col-1,grid);
        }
    }
}