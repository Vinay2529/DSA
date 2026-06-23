class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color) {
            return image;
        }
        dfsCore(image, sr, sc, original, color);
        return image;
    }

    private void dfsCore(int[][] image, int row, int col, int original, int color) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || original != image[row][col]) {
            return;
        }
        image[row][col] = color;
        dfsCore(image, row + 1, col, original, color);
        dfsCore(image, row - 1, col, original, color);
        dfsCore(image, row, col + 1, original, color);
        dfsCore(image, row, col - 1, original, color);
    }
}