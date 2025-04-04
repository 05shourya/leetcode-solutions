// Last updated: 4/4/2025, 2:47:15 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>(); 
        Set<Integer> cols = new HashSet<>(); 
        
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    rows.add(i); 
                    cols.add(j); 
                }
            }
        }

        for(int i = 0 ; i < matrix.length; i++){
            if(rows.contains(i)){
                for(int j = 0 ; j < matrix[0].length ; j++){
                    matrix[i][j] = 0; 
                }
            }
        }

        for(int j = 0 ; j < matrix[0].length ; j++){
            if(cols.contains(j)){
                for(int i = 0 ; i < matrix.length ; i++){
                    matrix[i][j] = 0; 
                }
            }
        }
    }
}