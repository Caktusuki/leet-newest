import java.util.*;
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color) return image;
        int rows = image.length;
        int cols = image[0].length;   
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1];
            if (image[r][c] == original) {
                image[r][c] = color;
                int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
                for (int[] d : dirs) {
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                        queue.offer(new int[]{nr, nc});
                    }
                }
            }
        }
        return image;
    }
}
