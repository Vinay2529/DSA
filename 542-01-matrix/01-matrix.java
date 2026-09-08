class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dis = new int[n][m];
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    dis[i][j] = 0;
                    queue.add(i + "-" + j);
                } else {
                    dis[i][j] = m * n;
                }
            }
        }
        while (queue.size() > 0) {
            String top = queue.poll();
            int row = Integer.parseInt(top.split("-")[0]);
            int col = Integer.parseInt(top.split("-")[1]);
            int newDistance = dis[row][col] + 1;

            if (isValid(row - 1, col, mat) && dis[row - 1][col] > newDistance) {
                dis[row - 1][col] = newDistance;
                queue.add((row - 1) + "-" + col);
            }
            if (isValid(row + 1, col, mat) && dis[row + 1][col] > newDistance) {
                dis[row + 1][col] = newDistance;
                queue.add((row + 1) + "-" + col);
            }
            if (isValid(row, col - 1, mat) && dis[row][col - 1] > newDistance) {
                dis[row][col - 1] = newDistance;
                queue.add(row + "-" + (col - 1));
            }
            if (isValid(row, col + 1, mat) && dis[row][col + 1] > newDistance) {
                dis[row][col + 1] = newDistance;
                queue.add(row + "-" + (col + 1));
            }
        }
        return dis;
    }

    private boolean isValid(int row, int col, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        if (row < 0 || row >= m)
            return false;
        if (col < 0 || col >= n)
            return false;
        if (mat[row][col] != 1)
            return false;
        return true;
    }
}