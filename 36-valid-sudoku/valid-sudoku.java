class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowset = new HashSet[9];
        Set<Character>[] colset = new HashSet[9];
        Set<Character>[] gridset = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rowset[i] = new HashSet<>();
            colset[i] = new HashSet<>();
            gridset[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int gridno = (i / 3) * 3 + (j / 3);
                if (board[i][j] != '.') {
                    boolean ispresentrow = rowset[i].contains(board[i][j]);
                    boolean ispresentcol = colset[j].contains(board[i][j]);
                    boolean ispresentgrid = gridset[gridno].contains(board[i][j]);

                    if (ispresentrow || ispresentcol || ispresentgrid) {
                        return false;
                    }
                    rowset[i].add(board[i][j]);
                    colset[j].add(board[i][j]);
                    gridset[gridno].add(board[i][j]);
                }
            }
        }
        return true;
    }
}