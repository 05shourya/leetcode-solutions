// Last updated: 5/8/2025, 10:15:21 PM
class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length; 
        int m = moveTime[0].length; 
        boolean visited[][] = new boolean[n][m]; 
        int directions[][] = {{0 , 1} , {0 , -1} , {1 , 0} , {-1 , 0}}; 
        Queue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.add(new int[]{0 , 0 , 0 , 1});

        while(!pq.isEmpty()){
            int[] current = pq.poll(); 
            int x = current[0]; 
            int y = current[1]; 
            int currTime = current[2]; 
            int stepCost = current[3]; 

            if(x == n - 1 && y == m -1) return currTime; 
            if(visited[x][y]) continue; 
            visited[x][y] = true; 

            for(int dir[] : directions){
                int nx = x + dir[0]; 
                int ny = y + dir[1]; 

                if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]){
                    int cost = stepCost == 1 ? 1 : 2;
                    int waitTime = Math.max(0 , moveTime[nx][ny] - currTime); 
                    int nextTime = cost + currTime + waitTime; 

                    pq.add(new int[]{nx , ny , nextTime , 1 - stepCost}); 
                }
            }
        } 

        return -1; 
         
    }
}