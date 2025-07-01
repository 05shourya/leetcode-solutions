// Last updated: 7/1/2025, 11:02:36 PM
class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length , 
        m = moveTime[0].length; 
        boolean visited[][] = new boolean[n][m];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.add(new int[]{0, 0, 0});

        while(!pq.isEmpty()){
            int[] curr = pq.poll(); 
            int x = curr[0]; 
            int y = curr[1];
            int currTime = curr[2]; 

            
            if(x == n - 1 && y == m - 1) return currTime; 
            if(visited[x][y]) continue; 
            visited[x][y] = true; 

            for(int dir[] : directions){
                int nx = x + dir[0]; 
                int ny = y + dir[1]; 

                if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]){
                    int waitTime = Math.max(0 , moveTime[nx][ny] - currTime); 
                    int nextTime = 1  + currTime  + waitTime; 
                    pq.add(new int[]{nx , ny , nextTime}); 
                }

            }
        }

        
        return -1;  
    }
}