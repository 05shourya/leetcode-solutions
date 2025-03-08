class Solution {
    public int minimumRecolors(String blocks, int k) {
        int W = 0 ; 
        int minW = 0; 
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W'){
                W++; 
            }
        }
        minW = W; 

        for(int i = k ; i < blocks.length() ; i++){
            if(blocks.charAt(i - k) == 'W'){
                W--; 
            }
            if(blocks.charAt(i) == 'W'){
                W++; 
            }
            minW = Math.min(minW , W); 
        }
        return minW; 
    }
}