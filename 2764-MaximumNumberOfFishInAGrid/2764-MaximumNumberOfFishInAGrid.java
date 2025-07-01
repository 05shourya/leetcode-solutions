// Last updated: 7/1/2025, 11:04:11 PM
class Solution {

    int[][] directions = {{0 , 1} , {0 , -1} , {1 , 0} , {-1 , 0}}; 
    
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxFish = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] > 0) {
                    int currentFish = bfs(grid, r, c);
                    maxFish = Math.max(maxFish, currentFish);
                }
            }
        }

        return maxFish;
    }

    private int bfs(int grid[][] , int r , int c){
        int n = grid.length; 
        int m = grid[0].length; 

        Queue<int[]> q = new ArrayDeque<>(); 
        q.offer(new int[]{r , c});
        int totalFishes = grid[r][c]; 
        grid[r][c] = 0; 

        while(!q.isEmpty()){
            int[] curr = q.poll(); 
            int row = curr[0]; 
            int col = curr[1]; 

            for(int[] dir : directions){
                int nx = row + dir[0]; 
                int ny = col + dir[1]; 

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && grid[nx][ny] > 0){
                    totalFishes += grid[nx][ny]; 
                    grid[nx][ny] = 0; 
                    q.offer(new int[]{nx , ny}); 
                }
            }
        } 
        return totalFishes; 
    }

}