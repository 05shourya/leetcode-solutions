// Last updated: 7/1/2025, 11:03:02 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true; 
        for(int i = 1 ; i < nums.length ; i++){
            if((nums[i] % 2 == 0 && nums[i - 1] % 2 == 0) || (nums[i] % 2 != 0 && nums[i - 1] % 2 != 0)){
                return false; 
            }
        }
        return true; 
    }
}