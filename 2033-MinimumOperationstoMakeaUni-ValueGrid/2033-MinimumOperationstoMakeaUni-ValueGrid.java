// Last updated: 3/26/2025, 10:42:42 PM
class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length * grid[0].length];
        int index = 0;  
        int base = grid[0][0]; 
        for(int[] nums : grid){
            for(int num : nums){
                arr[index++] = num;
                if((base - num) % x != 0){
                    return -1; 
                }
            }
        }

        Arrays.sort(arr); 
        int median = arr[arr.length / 2]; 
        int count = 0; 


        for(int num : arr){
            count += Math.abs(num - median) / x; 
        }

        return count; 
    }
}