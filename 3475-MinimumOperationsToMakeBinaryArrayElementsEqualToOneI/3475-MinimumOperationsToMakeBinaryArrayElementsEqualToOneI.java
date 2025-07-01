// Last updated: 7/1/2025, 11:02:51 PM
class Solution {
    private int flip(int num){
        return num == 0 ? 1 : 0; 
    }
    
    public int minOperations(int[] nums) {
        int operations = 0; 
        for(int i = 0 ; i <= nums.length -3  ; i++){
            if(nums[i] == 0){
                nums[i] = flip(nums[i]); 
                nums[i + 1] = flip(nums[i + 1]); 
                nums[i + 2] = flip(nums[i + 2]);
                operations++;  
                System.out.println("Flipped at " + i); 
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                return -1; 
            }
        }
        return operations; 
    }
}