class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] height) {
        List<List<Integer>> result=new ArrayList<>();
        if(height==null || height.length==0 || height[0].length==0){
            return result;
        }
        int m=height.length;
        int n=height[0].length;
        boolean[][] CanReachAtlantic=new boolean[m][n];
        boolean[][] CanReachPacific=new boolean[m][n];
        for(int j=0;j<n;j++){
            dfs(height,CanReachPacific,0,j);
            dfs(height,CanReachAtlantic,m-1,j);
        }
        for(int i=0;i<m;i++){
            dfs(height,CanReachPacific,i,0);
            dfs(height,CanReachAtlantic,i,n-1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(CanReachPacific[i][j] && CanReachAtlantic[i][j]){
                    List<Integer> coordinate=new ArrayList<>();
                    coordinate.add(i);
                    coordinate.add(j);
                    result.add(coordinate);
                }
            }
        }
        return result;
    }

    private void dfs(int[][] height, boolean[][] reachOcean, int row, int col) {
        reachOcean[row][col] = true;
        int[][] direction = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] dir : direction) {
            int i = row + dir[0];
            int j = col + dir[1];

            if (i >= 0 && i < height.length && j >= 0 && j < height[0].length && !reachOcean[i][j] && height[row][col] <= height[i][j]) {
                dfs(height, reachOcean, i, j);
            }
        }

    }
}
