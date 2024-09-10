import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<int[]> rotten = new LinkedList<>();
        int minutes = 0;
        int rows = grid.length, cols = grid[0].length;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    fresh++;
                } else if (grid[row][col] == 2) {
                    rotten.offer(new int[]{row, col});
                }
            }
        }
        
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        
        while (!rotten.isEmpty() && fresh > 0) {
            minutes++;
            int size = rotten.size();
            for (int i = 0; i < size; i++) {
                int[] cell = rotten.poll();
                for (int[] dir : directions) {
                    int newRow = cell[0] + dir[0];
                    int newCol = cell[1] + dir[1];
                    if (newRow >= 0 && newCol >= 0 && newRow < rows && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        fresh--;
                        rotten.offer(new int[]{newRow, newCol});
                        if (fresh == 0) {
                            return minutes;
                        }
                    }
                }
            }
        }
        
        return fresh == 0 ? minutes : -1;
    }
}
