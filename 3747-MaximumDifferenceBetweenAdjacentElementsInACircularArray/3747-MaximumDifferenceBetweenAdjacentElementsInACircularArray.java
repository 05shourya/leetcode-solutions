// Last updated: 7/1/2025, 11:02:11 PM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int res = Integer.MIN_VALUE; 
        int n = nums.length ; 
        for(int i = 0 ; i < n - 1; i++){
            res = Math.max(res , Math.abs(nums[i] - nums[i + 1])); 
        }

        res = Math.max(res , Math.abs(nums[n - 1] - nums[0])); 

        return res; 
    }
}