class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] height) {
        List<List<Integer>> result = new ArrayList<>();
        if (height == null || height.length == 0 || height[0].length == 0) {
            return result;
        }
        int m = height.length;
        int n = height[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for (int j = 0; j < n; j++) {
            dfs(height, pacific, 0, j);
            dfs(height, atlantic, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            dfs(height, pacific, i, 0);
            dfs(height, atlantic, i, n - 1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> coordinate = new ArrayList<>();
                    coordinate.add(i);
                    coordinate.add(j);
                    result.add(coordinate);
                }
            }
        }
        return result;
    }

    private void dfs(int[][] height, boolean[][] canReachOcean, int i, int j) {
        int m = height.length;
        int n = height[0].length;
        canReachOcean[i][j] = true;

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int[] dir : directions){
            int newRow = i + dir[0];
            int newCol = j + dir[1];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !canReachOcean[newRow][newCol] &&
               height[newRow][newCol] >= height[i][j]) {
                dfs(height, canReachOcean, newRow, newCol);
            }
        }
    }
}
