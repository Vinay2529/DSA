class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rzero = false, czero = false;
        int m = matrix.length, n = matrix[0].length;
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                rzero = true;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                czero = true;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (rzero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (czero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}