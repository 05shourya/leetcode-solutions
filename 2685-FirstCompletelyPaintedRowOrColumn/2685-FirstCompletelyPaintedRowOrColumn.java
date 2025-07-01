// Last updated: 7/1/2025, 11:04:29 PM
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length; 
        int m = mat[0].length; 

        Map<Integer, int[]> map = new HashMap<>(); 
        
        int[] row = new int[n]; 
        int[] col = new int[m]; 

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                map.put(mat[i][j] , new int[]{i , j}); 
            }
        }
        
        for(int x = 0 ; x < arr.length; x++){
            int num = arr[x]; 
            int i = map.get(num)[0]; 
            int j = map.get(num)[1];

            row[i] += 1; 
            col[j] += 1; 

            if(row[i] == m || col[j] == n) return x; 

        }

        return -1; 
    }
}