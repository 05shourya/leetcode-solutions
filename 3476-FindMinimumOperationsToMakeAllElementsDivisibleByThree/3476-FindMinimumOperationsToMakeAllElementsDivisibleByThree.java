// Last updated: 7/1/2025, 11:02:49 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0 ; 
        for(int num : nums){
            if(num % 3 != 0){
                count++;
            }
        }
        return count; 
    }
}