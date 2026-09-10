class Solution {
    public int uniquePaths(int m, int n) {
        int totalMoves = m + n - 2;
        int moves = Math.min(m - 1, n - 1);

        long result = 1;

        for (int i = 1; i <= moves; i++) {
            result = result * (totalMoves - moves + i) / i;
        }

        return (int) result;
    }
}