// Last updated: 10/3/2025, 9:44:31 PM
class Solution {
     public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }

        int m = heightMap.length;
        int n = heightMap[0].length;
        int result = 0;

        PriorityQueue<Cell> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.height));

        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    minHeap.offer(new Cell(i, j, heightMap[i][j]));
                    visited[i][j] = true;
                }
            }
        }

        int[] directions = {-1, 0, 1, 0, 0, -1, 0, 1}; 

        while (!minHeap.isEmpty()) {
            Cell cell = minHeap.poll();

            for (int i = 0; i < 4; i++) {
                int newRow = cell.row + directions[i * 2];
                int newCol = cell.col + directions[i * 2 + 1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    if (heightMap[newRow][newCol] < cell.height) {
                        result += cell.height - heightMap[newRow][newCol];
                    }
                    minHeap.offer(new Cell(newRow, newCol, Math.max(heightMap[newRow][newCol], cell.height)));
                }
            }
        }

        return result;
    }

    private static class Cell {
        int row, col, height;
        public Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }
    }
}