class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[] = new int[2]; 
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int nums[] : grid){
            for(int num: nums){
                map.put(num , map.getOrDefault(num, 0) + 1); 
                if(map.get(num) == 2){
                    res[0] = num; 
                }
            }
        }

        for(int i = 1 ; i <= grid.length * grid.length ; i++){
            if(!map.containsKey(i)){
                res[1] = i; 
                return res; 
            }
        }

        
        return res; 
    }
}